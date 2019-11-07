
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
	@Override
	public void cadastrar(Produto produto) {
		if (this.proximo == null) {
			this.produto = produto;
			this.proximo = new RepositorioProdutosLista();
		} else {
			this.proximo.cadastrar(produto);
		}
	}
	@Override
	public String remover(Produto produto, String nome_Produto) {
		if (this.produto == null) {
			return "Esse produto não existe";
		}

		else if (this.produto.getNome_Produto() == nome_Produto) {
			this.produto = this.proximo.produto;
			this.proximo = this.proximo.proximo;
			return "%s, " + nome_Produto + "removido com sucesso";
		} else {
			return this.proximo.remover(produto, nome_Produto);
		}

	}
	@Override
	public boolean procurar(Produto produto, String nome_Produto) {
		if (this.produto == null) {
			return false;
		} else if (this.produto.getNome_Produto() == nome_Produto) {
			return true;
		} else {
			return this.proximo.procurar(produto, nome_Produto);
		}
	}

	

}
