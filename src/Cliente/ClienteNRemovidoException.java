package Cliente;

public class ClienteNRemovidoException extends Exception {
	private Cliente cliente;

	public ClienteNRemovidoException(Cliente cliente) {
		super("Cliente não removido, pois não existe");

	}

}
