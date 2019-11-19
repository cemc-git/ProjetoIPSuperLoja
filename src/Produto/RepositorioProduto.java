package Produto;

public interface RepositorioProduto {
	public String removerProduto(String nomeproduto) throws ProdutoNaoRemovidoException;
	public  boolean existeProduto(Produto produto, String nomedoproduto) throws ProdutoInexistenteException;
	public void cadastrarProduto(Produto produto);
	public Produto procurarProduto(Produto produto, String nomedoproduto) throws ProdutoNaoEncontradoException;
	
}


