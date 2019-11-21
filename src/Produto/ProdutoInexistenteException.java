package Produto;

public class ProdutoInexistenteException extends Exception {
	public ProdutoInexistenteException() {
		super("Este produto não existe.");

	}

}
