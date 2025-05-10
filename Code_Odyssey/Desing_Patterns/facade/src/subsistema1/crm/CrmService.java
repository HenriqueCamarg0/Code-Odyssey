package subsistema1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarcliente(String nome, String cpf, String cep , String cidade, String estado) {
        // Lógica para gravar o cliente
        System.out.println("Gravando cliente: " + nome + ", CPF: " + cpf + ", CEP: " + cep + "CIDADE: " + cidade + "ESTADO: " + estado);
        System.out.println("Cliente gravado com sucesso!");
    }
}
