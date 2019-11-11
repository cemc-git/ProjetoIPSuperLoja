package Venda;


public class VendaNaoEncontradaException extends Exception {
private Venda venda;

public VendaNaoEncontradaException(Venda venda) {
	
	super ("A venda a ser atualizada n�o foi encontrada");
	this.venda=venda;
}

public Venda getVenda() {
	return venda;
}

	
}
