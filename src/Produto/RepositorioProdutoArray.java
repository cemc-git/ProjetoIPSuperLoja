package Produto;

public class RepositorioProdutoArray implements RepositorioProduto {
	private Produto[] produtos;
	private int indice;
	private int quantidade;

	public void RepositorioprodutosArray(int quantidade) {
		produtos = new Produto[quantidade];
		indice = quantidade;
	}

	public void cadastrar(Produto produto) throws ProdutoInexistenteException {
		if (produto==null) {
			throw new ProdutoInexistenteException(produto);
		} else if (indice<=produtos.length) {
			for (int i = 0; i<produtos.length; i++) {
				produtos[i] = produto;
			}
		}					
}

@Override
	public String remover(Produto produto, String nomeproduto) throws ProdutoInexistenteException {
		for(int i = 0; i<quantidade; i++) 
			if(nomeproduto.equals(produtos[i]))
				produtos[i] = null;
		return "O Produto " + nomeproduto + " foi removido com sucesso!";
}

@Override
public boolean procurar(Produto produto, String nomeproduto) {
	for (int i = 0; i < produtos.length; i++) 
		if (nomeproduto.equals(produtos[i]));
		return true;

}
}
	
