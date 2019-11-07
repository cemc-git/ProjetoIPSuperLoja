
public interface RepositorioProduto {
		public void cadastrar(Produto produto);
		public String remover(Produto produto, String nome_Produto);
		public  boolean procurar(Produto produto, String nome_Produto);
}
