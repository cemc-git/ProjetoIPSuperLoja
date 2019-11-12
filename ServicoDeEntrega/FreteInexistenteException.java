package projeto;

public class FreteInexistenteException extends Exception {
	public FreteInexistenteException(ServicoDeEntrega frete) {
		super ("O Frete procurado não existe!");
	}
}

