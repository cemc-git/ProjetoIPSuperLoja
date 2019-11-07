
	public class RepositorioProdutosArray implements RepositorioProduto {
		private Produto[] produto;
		private int indice;
		public RepositorioProdutosArray(int tamanho) {
			Produto = new Produto[indice];
			indice++;
		}
		@Override
		public void cadastrar(Produto produto) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public String remover(Produto produto, String nome_Produto) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public boolean procurar(Produto produto, String nome_Produto) {
			// TODO Auto-generated method stub
			return false;
		}
}

}
