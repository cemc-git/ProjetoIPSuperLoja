package Venda;
import Pessoa.Pessoa;

public class PessoaNaoCadastradoException extends Exception{
private Pessoa pessoa;
	
public 	PessoaNaoCadastradoException(Pessoa pessoa,String tipo) {
	
	super(tipo+" n�o est� cadastrado");
	this.pessoa=pessoa;
}

public Pessoa getPessoa() {
	return pessoa;
}


	
}
