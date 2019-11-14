package Produto;
	
public class RepositorioProdutosArray implements RepositorioProduto {
		private Produtos[] produto;
		private int indice;
		
		public RepositorioProdutosArray(int quantidade) {
			repositorioProdutosArray = new Produtos[quantidade];
			indice = quantidade;
		}
		
		@Override
		public void cadastrar(Produto produto) {
			for (int i = 0; i<indice; indice; i++) {
				repositorioProdutosArray[i] = Produto(String nome, double valor, int quantidade, double valordecompra, double valordevenda)
						
			}
			
		}
		@Override
		public String remover(Produto produto, String nomeproduto) {
			for(int i = 0; i<quantidade; i++) {
				if(nomeproduto.equals(repositorioProdutosArrays[i].Produto.getNome()))
					repositorioProdutosArrays[i] = null;
			return "O Produto " + nomeproduto + " foi removido com sucesso!";
		}
			
		@Override
		public boolean procurar(Produto produto, String nomeproduto) {
			for(int i = 0; i<quantidade; i++) {
				if(nomeproduto.equals(repositorioProdutosArrays[i].Produto.getNome()))
				break;
			return true;
		}
}

}
