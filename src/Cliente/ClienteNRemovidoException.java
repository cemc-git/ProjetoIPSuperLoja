package Cliente;

public class ClienteNRemovidoException extends Exception {
	private Cliente cliente;

	public ClienteNRemovidoException(Cliente cliente) {
		super("Cliente n�o removido, pois n�o existe");

	}

}
