# Jogo Sudoku em Java

## 📋 Descrição
Um jogo Sudoku com interface de terminal desenvolvido em Java puro. Este projeto implementa um clássico quebra-cabeça Sudoku completamente funcional, com geração aleatória de tabuleiros, diferentes níveis de dificuldade e um sistema de validação de jogadas em tempo real.

## 🎮 Funcionalidades
- Tabuleiro Sudoku 9x9 completo
- Três níveis de dificuldade (Fácil, Médio, Difícil)
- Geração automática de puzzles válidos
- Interface de terminal com visualização clara do tabuleiro
- Sistema de validação de jogadas
- Verificação de progresso
- Células fixas que não podem ser modificadas
- Opção para reiniciar o jogo ou criar novo puzzle

## 🛠️ Tecnologias Utilizadas
- Java (JDK 8 ou superior)
- Algoritmos de backtracking para geração e validação

## 🚀 Como Executar
1. Clone este repositório
```bash
git clone https://github.com/seu-usuario/sudoku-java.git
```

2. Navegue até o diretório do projeto
```bash
cd sudoku-java
```

3. Compile o código-fonte
```bash
javac SudokuGame.java
```

4. Execute o jogo
```bash
java SudokuGame
```

## 📝 Como Jogar
1. Escolha um nível de dificuldade (1-Fácil, 2-Médio, 3-Difícil)
2. Use o menu para navegar pelas opções do jogo:
   - Opção 1: Inserir um número no tabuleiro
     - Informe a linha (1-9)
     - Informe a coluna (1-9)
     - Escolha o número a inserir (1-9) ou 0 para apagar
   - Opção 2: Verificar se o tabuleiro está correto até o momento
   - Opção 3: Reiniciar jogo
   - Opção 4: Sair

3. Complete o tabuleiro seguindo as regras do Sudoku:
   - Cada linha deve conter os números de 1 a 9 sem repetição
   - Cada coluna deve conter os números de 1 a 9 sem repetição
   - Cada bloco 3x3 deve conter os números de 1 a 9 sem repetição

## 🔍 Melhorias Futuras
- [ ] Adicionar interface gráfica com JavaFX ou Swing
- [ ] Implementar sistema de pontuação baseado no tempo e dificuldade
- [ ] Salvar/carregar jogos em andamento
- [ ] Adicionar dicas para o jogador
- [ ] Criar modo "desafio diário" com quebra-cabeças únicos
- [ ] Otimizar o algoritmo de geração para puzzles mais desafiadores
- [ ] Adicionar histórico de jogos e estatísticas do jogador
- [ ] Implementar sistema de recordes
- [ ] Criar modo multijogador local
- [ ] Adicionar sons e efeitos visuais para feedback ao jogador
- [ ] Desenvolver versão para dispositivos móveis (Android)

👨‍💻 Autor
[Henrique Camargo] - [https://github.com/HenriqueCamarg0]
