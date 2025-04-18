public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Atributos
    private String modelo;
    private String numeroDeSerie;
    private int capacidade;
    private boolean ligado;

    public iPhone(String modelo, String numeroDeSerie, int capacidade) {
        this.modelo = modelo;
        this.numeroDeSerie = numeroDeSerie;
        this.capacidade = capacidade;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println("iPhone ligado");
    }

    public void desligar() {
        ligado = false;
        System.out.println("iPhone desligado");
    }

    public boolean getStatus() {
        return ligado;
    }

       
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
    
    // Implementação da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }
    
    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    
    // Implementação da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    
    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Nova aba aberta com a página: " + url);
    }
    
    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    // Implementação da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando musica");

    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

}



