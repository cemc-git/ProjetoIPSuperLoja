
package Funcionario;

public class CadastroFuncionario {
	private RepositorioFuncionario repositoriofuncionario;
//Minha vari�vel repositoriofuncionario � do tipo RepositorioFuncionario(Ou seja, do tipo da minha interface) e ele vai receber RepositorioArray ou RepositorioLista 
//A execu��o do meu cadastro vem antes dos reposit�rio.Primeiro acontece no cadastro pra dps ir ao reposit�rio realizar a fun��o!

	public CadastroFuncionario(RepositorioFuncionario repositorioarrayoulista) {
		repositoriofuncionario = repositorioarrayoulista;
		// repositoriofuncionario literalmente recebera o repositorio array ou lista,vai
		// depender de como ta no main

	}

//Meu m�todo cadastrar interagi com meu m�todo inserir do reposit�riolista ou repositorioarray
	public void cadastrar(Funcionario funcionario) throws FuncionarioCadastradoException {

		if (repositoriofuncionario.existe(funcionario.getCpf()) == false) {
			// se n�o existir um funcionario com esse cpf, ent�o ir� coloc�-lo chamando o
			// m�todo inserir
			repositoriofuncionario.inserir(funcionario);
		} else {
			// Se j� existir, ent�o dar� erro!
			throw new FuncionarioCadastradoException();
		}
	}

	public void remover(Funcionario funcionario) throws FuncionarioNaoExisteException {
		if (repositoriofuncionario.existe(funcionario.getCpf()) == false) {
			throw new FuncionarioNaoExisteException();
		} else {
			repositoriofuncionario.remover(funcionario.getCpf());
		}

	}

	public Funcionario procurar(Funcionario funcionario) throws FuncionarioNaoExisteException {
		if (repositoriofuncionario.existe(funcionario.getCpf()) == false) {
			throw new FuncionarioNaoExisteException();
		} else {
			return repositoriofuncionario.procurar(funcionario.getCpf());
		}
	}

	public void atualizar(Funcionario funcionario) throws FuncionarioNaoExisteException {
		if (repositoriofuncionario.existe(funcionario.getCpf()) == false) {
			throw new FuncionarioNaoExisteException();
		} else {
			repositoriofuncionario.atualizar(funcionario);
		}
	}

}