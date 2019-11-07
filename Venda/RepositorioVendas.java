package projeto;

public interface RepositorioVendas {

	//falta adicionar as excecoes
	
	public void inserir(Venda venda);
	
	public boolean existe(Venda venda);

	public Venda buscar(int id);

	public void atualizar(Venda vendaAntiga, Venda vendaAtualizada);
}
