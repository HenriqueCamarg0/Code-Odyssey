import java.util.List;
import java.util.ArrayList;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }
    
    public void listarClientes() {
        System.out.println("=== Clientes do " + this.nome + " ===");
        for (Conta conta : contas) {
            System.out.println(conta.cliente.getNome() + " - Conta: " + conta.getNumero());
        }
    }
}