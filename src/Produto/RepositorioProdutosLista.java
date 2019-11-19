package Produto;
public class RepositorioProdutosLista implements RepositorioProduto {
	
	private Produto produto;
	private RepositorioProdutosLista proximo;

	public RepositorioProdutosLista() {
		this.produto = null;
		this.proximo = null;
	}
	public Produto getProduto() {
		return produto;
	}
	public RepositorioProdutosLista getProximo() {
		return proximo;
	}
	
	public void cadastrarProduto(Produto produto) {
		if (this.produto == null) {
			this.produto = produto;
			this.proximo = new RepositorioProdutosLista();
		} else {
			this.proximo.cadastrarProduto(produto);
		}
	}
	public String removerProduto(String nomeproduto) throws ProdutoNaoRemovidoException {
		if (this.produto == null) {
			throw new ProdutoNaoRemovidoException;
		}

		else if (this.produto.getNome_Produto() == nomeproduto) {
			this.produto = this.proximo.produto;
			this.proximo = this.proximo.proximo;
			return "%s, " + nomeproduto + "removido com sucesso";
		} else {
			return this.proximo.removerProduto(produto, nomeproduto);
		}

	}
	public boolean procurarProduto(Produto produto, String nomeproduto) throws ProdutoNaoEncontradoException {
		if (this.produto == null) {
			throw new ProdutoNaoEncontradoException;
		} else if (this.produto.getNome_Produto() == nomeproduto) {
			return true;
		} else {
			return this.proximo.procurar(produto, nomeproduto);
		}
 }
}