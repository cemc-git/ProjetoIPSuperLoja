package Cliente;

public class ClienteExisteException extends Exception {
	private Cliente cliente;

	public ClienteExisteException(String nome,String cpf) {
		super("Cliente já cadastrado");
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
}
