package Funcionario;

public interface RepositorioFuncionario {
//Interface do repositório, todos os meétodos usandos no repositório terão que está aqui!
	public void inserir(Funcionario funcionario) 

	public void remover(String cpf) throws FuncionarioNaoExisteException;

	public Funcionario procurar(String cpf) throws FuncionarioNaoExisteException;

	public void atualizar(Funcionario funcionario) throws FuncionarioNaoExisteException;

	public boolean existe(String cpf);
}
