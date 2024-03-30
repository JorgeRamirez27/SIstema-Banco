package proyecto_banco;
import java.util.*;

public class Banco {
    private List<Cliente> clientes;

    public  Banco(){
        this.clientes = new ArrayList<>();
    }
    public List<Cliente> getClientes() {
        return this.clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    // Método para agregar un cliente al banco
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
}
