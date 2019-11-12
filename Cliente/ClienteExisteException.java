package Cliente;

public class ClienteExisteException extends Exception {
	private Cliente cliente;

	
	
    public ClienteExisteException(Cliente cliente) {
    	super("Cliente já cadastrado");
    	this.cliente = cliente;
    }
    public Cliente getCliente() {
    	return cliente;
    }
}
