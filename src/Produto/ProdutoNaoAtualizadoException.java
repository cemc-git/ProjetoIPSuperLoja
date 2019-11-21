package Produto;

public class ProdutoNaoAtualizadoException extends Exception {
	ProdutoNaoAtualizadoException() {
		super("O Produto não foi atualizado");
	}
}
