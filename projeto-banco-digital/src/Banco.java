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
}
