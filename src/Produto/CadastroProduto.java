package Produto;

public class CadastroProduto {
	private RepositorioProduto prod;

	public CadastroProduto(String tipo) {
		if (tipo.equals("Array")) {
			prod = new RepositorioProdutoArray();

		} else {
			prod = new RepositorioProdutosLista();
		}
	}

	public void cadastrar(Produto produto, RepositorioProduto produtocadastrado) throws ProdutoJaExistenteException,
			ProdutoInexistenteException, ProdutoNaoEncontradoException, ProdutoNaoRemovidoException {
		if (produto == null) {
			throw new ProdutoInexistenteException();
		} else if (produtocadastrado != null) {
			throw new ProdutoJaExistenteException();

		} else if (produto.getNome_Produto().contentEquals("")) {
			throw new ProdutoNaoEncontradoException();

		}

	}

}
