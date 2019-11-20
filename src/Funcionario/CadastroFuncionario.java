
package Funcionario;

public class CadastroFuncionario {
	private RepositorioFuncionario repositoriofuncionario;
//Minha variável repositoriofuncionario é do tipo RepositorioFuncionario(Ou seja, do tipo da minha interface) e ele vai receber RepositorioArray ou RepositorioLista 
//A execução do meu cadastro vem antes dos repositório.Primeiro acontece no cadastro pra dps ir ao repositório realizar a função!

	public CadastroFuncionario(RepositorioFuncionario repositorioarrayoulista) {
		repositoriofuncionario = repositorioarrayoulista;
		// repositoriofuncionario literalmente recebera o repositorio array ou lista,vai
		// depender de como ta no main

	}

//Meu método cadastrar interagi com meu método inserir do repositóriolista ou repositorioarray
	public void cadastrar(Funcionario funcionario) throws FuncionarioCadastradoException {

		if (repositoriofuncionario.existe(funcionario.getCpf()) == false) {
			// se não existir um funcionario com esse cpf, então irá colocá-lo chamando o
			// método inserir
			repositoriofuncionario.inserir(funcionario);
		} else {
			// Se já existir, então dará erro!
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