import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cpf, String cep) {
        // Lógica para migrar o cliente
        System.out.println("Migrando cliente: " + nome + ", CPF: " + cpf + ", cep: " + cep);
        
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarcliente(nome, cpf, cep, cidade, estado);
    }
}