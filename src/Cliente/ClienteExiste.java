package Cliente;

public class ClienteExiste extends Exception {
	private Cliente cliente;
	
    public ClienteExiste(Cliente cliente) {
    	super("Cliente já cadastrado");
    	
    }
}
