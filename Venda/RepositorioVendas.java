package Venda;

public interface RepositorioVendas {

	//falta adicionar as excecoes
	
	public void inserir(Venda venda) throws InserirExistenteException;
	
	public boolean existe(Venda venda);

	public Venda buscar(int id) throws BuscaIdException;

	public void atualizar(Venda vendaAntiga, Venda vendaAtualizada) throws VendaNaoEncontradaException;
	
	public void remover ( Venda venda) throws VendaNaoEncontradaException;
}
