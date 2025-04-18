public class App {
        public static void main(String[] args) {
            iPhone iphone = new iPhone("iPhone 13", "ABC123", 128);
            
            // Testando funcionalidades do dispositivo
            iphone.ligar();
            
            // Testando funcionalidades de reprodutor musical
            System.out.println("\n--- Reprodutor Musical ---");
            iphone.selecionarMusica("Imagine - John Lennon");
            iphone.tocar();
            iphone.pausar();
            
            // Testando funcionalidades de telefone
            System.out.println("\n--- Aparelho Telefônico ---");
            iphone.ligar("123-456-789");
            iphone.atender();
            iphone.iniciarCorreioVoz();
            
            // Testando funcionalidades de navegador
            System.out.println("\n--- Navegador Internet ---");
            iphone.exibirPagina("https://www.google.com");
            iphone.adicionarNovaAba("https://www.github.com");
            iphone.atualizarPagina();
            
            iphone.desligar();    }
}
