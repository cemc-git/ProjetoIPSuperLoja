package produto;
public class RepositorioprodutosLista implements RepositorioProduto {

	private produto produto;
	private RepositorioprodutosLista proximo;

	public RepositorioprodutosLista() {
		this.produto = null;
		this.proximo = null;
	}

	public produto getProduto() {
		return produto;
	}

	public RepositorioprodutosLista getProximo() {
		return proximo;
	}
	@Override
	public void cadastrar(produto produto) {
		if (this.proximo == null) {
			this.produto = produto;
			this.proximo = new RepositorioprodutosLista();
		} else {
			this.proximo.cadastrar(produto);
		}
	}
	@Override
	public String remover(produto produto, String nomeproduto) {
		if (this.produto == null) {
			return "Esse produto nÃ£o existe";
		}

		else if (this.produto.getNome_Produto() == nomeproduto) {
			this.produto = this.proximo.produto;
			this.proximo = this.proximo.proximo;
			return "%s, " + nomeproduto + "removido com sucesso";
		} else {
			return this.proximo.remover(produto, nomeproduto);
		}

	}
	@Override
	public boolean procurar(produto produto, String nomeproduto) {
		if (this.produto == null) {
			return false;
		} else if (this.produto.getNome_Produto() == nomeproduto) {
			return true;
		} else {
			return this.proximo.procurar(produto, nomeproduto);
		}
	}

	

}
