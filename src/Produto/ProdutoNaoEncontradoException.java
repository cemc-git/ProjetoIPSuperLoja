package Produto;

public class ProdutoNaoEncontradoException extends Exception {
		ProdutoNaoEncontradoException(){
		super("O produto não foi encontrado.");
	}

}
