public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Testando o padrão Facade
        Facade facade = new Facade();
        facade.migrarCliente("João da Silva", "12345678900", "12345678");
        // Saída esperada:
        // Migrando cliente: João da Silva, CPF: 12345678900, cep: 12345678
        
    }
}
