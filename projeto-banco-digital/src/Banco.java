import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private List<Cliente> contasRegistradas = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        if (cliente != null) {
            this.contasRegistradas.add(cliente);
        } else {
            System.out.println("Cliente inválido. Não pode ser adicionado.");
        }
    }

    // Método para listar clientes registrados
    public void listarClientes() {
        for (Cliente cliente : contasRegistradas) {
            System.out.println(cliente);
        }
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("Baruk", "12345678900");
        Cliente cliente2 = new Cliente("Palmito", "12345678911");
        Cliente cliente3 = new Cliente("Panchito", "12345678922");

        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);
        banco.adicionarCliente(cliente3);

        banco.listarClientes();
    }



}
