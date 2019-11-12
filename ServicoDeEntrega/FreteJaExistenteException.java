package projeto;

public class FreteJaExistenteException extends Exception {
	public FreteJaExistenteException(ServicoDeEntrega frete) {
		super("O frete já foi computado!");
	}
}
