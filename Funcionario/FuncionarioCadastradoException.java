//extends e quando herda
public class FuncionarioCadastradoException extends Exception {
	
	public FuncionarioCadastradoException() {
	super("N�o foi poss�vel cadastrar o funcion�rio, pois esse j� est� cadastrado");	
	}

}
