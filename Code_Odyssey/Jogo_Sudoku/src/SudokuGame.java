// Arquivo: SudokuGame.java
import java.util.Scanner;
import java.util.Random;

public class SudokuGame {
    private static final int GRID_SIZE = 9;
    private int[][] board;
    private int[][] solution;
    private boolean[][] fixed;
    private final int EMPTY_CELL = 0;
    private Scanner scanner;
    private int difficultyLevel; // 1-Easy, 2-Medium, 3-Hard

    public SudokuGame() {
        board = new int[GRID_SIZE][GRID_SIZE];
        solution = new int[GRID_SIZE][GRID_SIZE];
        fixed = new boolean[GRID_SIZE][GRID_SIZE];
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        SudokuGame game = new SudokuGame();
        game.startGame();
    }

    public void startGame() {
        System.out.println("=== SUDOKU ===");
        System.out.println("Bem-vindo ao jogo Sudoku!");
        
        // Selecionar nível de dificuldade
        selectDifficulty();
        
        // Gerar um tabuleiro
        generateBoard();
        
        // Loop principal do jogo
        boolean quit = false;
        while (!quit && !isBoardFull()) {
            printBoard();
            
            System.out.println("\nOpções:");
            System.out.println("1. Inserir número");
            System.out.println("2. Verificar tabuleiro");
            System.out.println("3. Reiniciar jogo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            int option = getValidIntInput(1, 4);
            
            switch (option) {
                case 1:
                    makeMove();
                    break;
                case 2:
                    checkBoard();
                    break;
                case 3:
                    generateBoard();
                    break;
                case 4:
                    quit = true;
                    break;
            }
            
            // Verificar se o tabuleiro está completo e correto
            if (isBoardFull() && isBoardCorrect()) {
                printBoard();
                System.out.println("\nParabéns! Você completou o Sudoku corretamente!");
                
                System.out.print("Jogar novamente? (S/N): ");
                String playAgain = scanner.next().toUpperCase();
                if (playAgain.startsWith("S")) {
                    generateBoard();
                } else {
                    quit = true;
                }
            }
        }
        
        System.out.println("Obrigado por jogar Sudoku!");
        scanner.close();
    }
    
    private void selectDifficulty() {
        System.out.println("\nSelecione a dificuldade:");
        System.out.println("1. Fácil (35-40 números preenchidos)");
        System.out.println("2. Médio (30-35 números preenchidos)");
        System.out.println("3. Difícil (25-30 números preenchidos)");
        System.out.print("Escolha (1-3): ");
        
        difficultyLevel = getValidIntInput(1, 3);
    }
    
    private void generateBoard() {
        // Limpar o tabuleiro
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                board[i][j] = EMPTY_CELL;
                fixed[i][j] = false;
            }
        }
        
        // Gerar solução válida
        generateSolution();
        
        // Copiar solução para o tabuleiro
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                board[i][j] = solution[i][j];
            }
        }
        
        // Remover números para criar o puzzle
        createPuzzle();
        
        // Marcar células fixas
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                fixed[i][j] = board[i][j] != EMPTY_CELL;
            }
        }
    }
    
    private void generateSolution() {
        // Solução básica para um Sudoku válido
        // Iniciar com uma diagonal principal de 3 blocos 3x3
        fillDiagonal();
        
        // Preencher o resto do tabuleiro
        solveSudoku(0, 0);
        
        // Copiar para a solução
        for (int i = 0; i < GRID_SIZE; i++) {
            System.arraycopy(board[i], 0, solution[i], 0, GRID_SIZE);
        }
    }
    
    private void fillDiagonal() {
        for (int i = 0; i < GRID_SIZE; i += 3) {
            fillBox(i, i);
        }
    }
    
    private void fillBox(int row, int col) {
        Random random = new Random();
        int num;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    num = random.nextInt(9) + 1;
                } while (!isValidInBox(row, col, num));
                board[row + i][col + j] = num;
            }
        }
    }
    
    private boolean isValidInBox(int rowStart, int colStart, int num) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[rowStart + i][colStart + j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean solveSudoku(int row, int col) {
        // Se chegamos ao final do tabuleiro, retornamos verdadeiro
        if (row == GRID_SIZE - 1 && col == GRID_SIZE) {
            return true;
        }
        
        // Se chegamos ao final da linha, vamos para a próxima
        if (col == GRID_SIZE) {
            row++;
            col = 0;
        }
        
        // Se a célula já está preenchida, avançamos para a próxima
        if (board[row][col] != EMPTY_CELL) {
            return solveSudoku(row, col + 1);
        }
        
        // Tentamos preencher com os números de 1 a 9
        for (int num = 1; num <= GRID_SIZE; num++) {
            if (isValid(row, col, num)) {
                board[row][col] = num;
                
                if (solveSudoku(row, col + 1)) {
                    return true;
                }
                
                // Se não encontramos solução, voltamos atrás
                board[row][col] = EMPTY_CELL;
            }
        }
        return false;
    }
    
    private void createPuzzle() {
        Random random = new Random();
        
        // Determinar quantas células deixar preenchidas, baseado na dificuldade
        int cellsToKeep;
        switch (difficultyLevel) {
            case 1: // Fácil
                cellsToKeep = random.nextInt(6) + 35; // 35-40 células
                break;
            case 2: // Médio
                cellsToKeep = random.nextInt(6) + 30; // 30-35 células
                break;
            case 3: // Difícil
                cellsToKeep = random.nextInt(6) + 25; // 25-30 células
                break;
            default:
                cellsToKeep = random.nextInt(6) + 30; // Padrão para médio
        }
        
        int cellsToRemove = GRID_SIZE * GRID_SIZE - cellsToKeep;
        
        while (cellsToRemove > 0) {
            int row = random.nextInt(GRID_SIZE);
            int col = random.nextInt(GRID_SIZE);
            
            if (board[row][col] != EMPTY_CELL) {
                board[row][col] = EMPTY_CELL;
                cellsToRemove--;
            }
        }
    }
    
    private void printBoard() {
        System.out.println("\n  | 1 2 3 | 4 5 6 | 7 8 9 |");
        System.out.println("--+-------+-------+-------+");
        
        for (int i = 0; i < GRID_SIZE; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < GRID_SIZE; j++) {
                if (board[i][j] == EMPTY_CELL) {
                    System.out.print(". ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
                if ((j + 1) % 3 == 0) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if ((i + 1) % 3 == 0) {
                System.out.println("--+-------+-------+-------+");
            }
        }
    }
    
    private void makeMove() {
        System.out.println("\nInserir número:");
        
        System.out.print("Linha (1-9): ");
        int row = getValidIntInput(1, 9) - 1;
        
        System.out.print("Coluna (1-9): ");
        int col = getValidIntInput(1, 9) - 1;
        
        if (fixed[row][col]) {
            System.out.println("Esta célula não pode ser modificada. Tente outra.");
            return;
        }
        
        System.out.print("Número (1-9 ou 0 para apagar): ");
        int num = getValidIntInput(0, 9);
        
        if (num == 0) {
            board[row][col] = EMPTY_CELL;
            System.out.println("Célula apagada!");
        } else if (isValid(row, col, num)) {
            board[row][col] = num;
            System.out.println("Número inserido com sucesso!");
        } else {
            System.out.println("Jogada inválida! Este número já existe na linha, coluna ou bloco 3x3.");
        }
    }
    
    private boolean isValid(int row, int col, int num) {
        // Verificar linha
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }
        
        // Verificar coluna
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }
        
        // Verificar bloco 3x3
        int boxRowStart = row - row % 3;
        int boxColStart = col - col % 3;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[boxRowStart + i][boxColStart + j] == num) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    private void checkBoard() {
        if (isBoardCorrect()) {
            System.out.println("O tabuleiro está correto até agora!");
        } else {
            System.out.println("Há erros no tabuleiro. Continue tentando!");
        }
    }
    
    private boolean isBoardCorrect() {
        // Verificar se as células preenchidas correspondem à solução
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                if (board[i][j] != EMPTY_CELL && board[i][j] != solution[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean isBoardFull() {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                if (board[i][j] == EMPTY_CELL) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private int getValidIntInput(int min, int max) {
        int input;
        while (true) {
            try {
                input = scanner.nextInt();
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.print("Entrada inválida. Escolha um número entre " + min + " e " + max + ": ");
                }
            } catch (Exception e) {
                System.out.print("Entrada inválida. Por favor, insira um número: ");
                scanner.next(); // Limpar input inválido
            }
        }
    }
}