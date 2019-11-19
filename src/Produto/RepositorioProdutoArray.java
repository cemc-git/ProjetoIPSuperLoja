package Produto;

public class RepositorioProdutoArray implements RepositorioProduto {
	private Produto[] produtos;
	private int indice;
	private int quantidade;
	private boolean removido, existe;
	

	public void RepositorioprodutosArray(int quantidade) {
		produtos = new Produto[quantidade];
		indice = quantidade;
	}

	public void cadastrarProduto(Produto produto) {
		if (indice <= produtos.length) {
			produtos[indice] = produto;
			indice++;
		} else {
			Produto[] aux = new Produto[produtos.length];
			aux = produtos;
			produtos = new Produto[produtos.length * 2];
			produtos = aux;
			quantidade = produtos.length;
		}
	}

	@Override
	public String removerProduto(String nomeproduto) throws ProdutoNaoRemovidoException {
		for (int i = 0; i < quantidade; i++) {
			if (nomeproduto.equals(produtos[i])) {
				produtos[i] = null;
				boolean removido = true;
			}
		}
		if (removido = true) {
			return "O Produto " + nomeproduto + " foi removido com sucesso!";
		} else {
			throw new ProdutoNaoRemovidoException();
		}
	}

	@Override
	public boolean existeProduto(String nomeproduto) throws ProdutoInexistenteException {
		for (int i = 0; i < produtos.length; i++) {
			if (nomeproduto.equals(produtos[i])) {
				existe = true;
			}
		}
		return existe;

	}
	
	public Produto procurarProduto(Produto produto, String nomedoproduto) throws ProdutoNaoEncontradoException{
		Produto aux = null;
		for(int i = 0; i < produtos.length; i++) {
			if (nomedoproduto.equals(produtos[i]));
			aux = produtos[i];
		} if (aux == null) {
			throw new ProdutoNaoEncontradoException();
		} else {
			return aux;
		}
		
	}
}
