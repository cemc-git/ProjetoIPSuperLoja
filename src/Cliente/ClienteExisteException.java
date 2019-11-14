package Cliente;

public class ClienteExisteException extends Exception {
	private Cliente cliente;

	
	
    public ClienteExisteException(Cliente cliente) {
    	super("Cliente j� cadastrado");
    	this.cliente = cliente;
    }
    public Cliente getCliente() {
    	return cliente;
    }
}
