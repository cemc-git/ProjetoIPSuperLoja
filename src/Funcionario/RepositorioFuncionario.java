package Funcionario;

public interface RepositorioFuncionario {
//Interface do reposit�rio, todos os me�todos usandos no reposit�rio ter�o que est� aqui!
	public void inserir(Funcionario funcionario) 

	public void remover(String cpf) throws FuncionarioNaoExisteException;

	public Funcionario procurar(String cpf) throws FuncionarioNaoExisteException;

	public void atualizar(Funcionario funcionario) throws FuncionarioNaoExisteException;

	public boolean existe(String cpf);
}
