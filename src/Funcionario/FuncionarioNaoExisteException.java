package Funcionario;

public class FuncionarioNaoExisteException extends Exception {
//Herda os erros da minha classe Exception!	
	public FuncionarioNaoExisteException() {
		super("O funcion�rio n�o existe");
	}
}
