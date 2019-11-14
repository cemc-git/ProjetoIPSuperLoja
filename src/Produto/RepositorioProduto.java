package produto;

public interface RepositorioProduto {
		public String remover(Produto produto, String nomeproduto) throws ProdutoInexistenteException;
		public  boolean procurar(Produto produto, String nomeproduto);
		public void cadastrar(Produto produto) throws ProdutoInexistenteException;
}
