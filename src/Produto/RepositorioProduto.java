package Produto;
public interface RepositorioProduto {
		public void cadastrar(Produto produto);
		public String remover(Produto produto, String nomeproduto);
		public  boolean procurar(Produto produto, String nomeproduto);
}
