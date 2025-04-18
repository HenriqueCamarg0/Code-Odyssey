public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital");
        
        Cliente joao = new Cliente("João");
        Cliente maria = new Cliente("Maria");
        
        Conta cc1 = new ContaCorrente(joao);
        Conta poupanca1 = new ContaPoupanca(joao);
        
        Conta cc2 = new ContaCorrente(maria);
        
        banco.adicionarConta(cc1);
        banco.adicionarConta(poupanca1);
        banco.adicionarConta(cc2);
        
        cc1.depositar(1000);
        cc1.transferir(500, poupanca1);
        cc1.sacar(200);
        
        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();
        
        cc2.depositar(2000);
        cc2.imprimirExtrato();
        
        banco.listarClientes();
    }
}
