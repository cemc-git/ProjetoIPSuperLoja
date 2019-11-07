//extends e quando herda
public class FuncionarioCadastradoException extends Exception {
	
	public FuncionarioCadastradoException() {
	super("Não foi possível cadastrar o funcionário, pois esse já está cadastrado");	
	}

}
