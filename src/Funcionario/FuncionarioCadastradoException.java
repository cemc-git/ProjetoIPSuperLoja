package Funcionario;

public class FuncionarioCadastradoException extends Exception {
	// Herda os erros da minha classe Exception!
	public FuncionarioCadastradoException() {
		super("Funcion�rio j� cadastrado");
	}

}
