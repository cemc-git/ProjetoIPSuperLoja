package Funcionario;

import Pessoa.Pessoa;

public class RepositorioFuncionarioLista implements RepositorioFuncionario {
	// Implements cria os métodos que minha interface RepositorioFuncionario
	// pede/tem, POIS REPOSITORIOFUNCIONARIOLISTA USARÁ
	private Funcionario funcionario;// Vou passar pra lista meu objeto funcionario
	private RepositorioFuncionarioLista proximo;// referencia para prox lista.

	public RepositorioFuncionarioLista() {
		this.funcionario = null;
		this.proximo = null;
	}

	// Inserior um funcionário na minha lista
	public void inserir(Funcionario funcionario) {
		if (this.funcionario.equals(null)) {
			this.funcionario = funcionario;
			this.proximo = new RepositorioFuncionarioLista(); // Aponto para a próxima lista encadeada.
		} else {
			this.proximo.inserir(funcionario);
		}
	}

	// Demitir um Funcionário é o mesmo que remover um funcionário.
	public void remover(String cpf) throws FuncionarioNaoExisteException {
		if (this.funcionario != null) {
			// Se o cpf do funcionario avaliado na lista em questao tem o mesmo cpf que eu
			// entro, ent vou remove-lo.
			if (this.funcionario.getCpf().equals(cpf)) {
				this.funcionario = this.proximo.funcionario;
				this.proximo = this.proximo.proximo;
			} else {
				this.proximo.remover(cpf);
			}
			// Se this.funcionario==null, isso quer dizer que não existe mais funcionario a
			// ser observado na lista, então quer dizer que não encontrou ninguém pra
			// remover.
		} else {
			throw new FuncionarioNaoExisteException();
		}
	}

	public Funcionario procurar(String cpf) throws FuncionarioNaoExisteException {
		if (this.funcionario != null) {
			// Se o cpf do funcionario avaliado na lista em questao tem o mesmo cpf que eu
			// entro, ent vou retornar o meu funcionario.
			if (this.funcionario.getCpf().equals(cpf)) {
				return this.funcionario;
			} else {
				return this.proximo.procurar(cpf);
			}
			// Se this.funcionario==null, isso quer dizer que não existe mais funcionario a
			// ser observado na lista, então quer dizer que não encontrou ninguém.
		} else {
			throw new FuncionarioNaoExisteException();
		}
	}

	public void atualizar(Funcionario funcionario) throws FuncionarioNaoExisteException {
		if (this.funcionario != null) {
			// Se o cpf do funcionario da lista em questao for igual ao cpf do funcionario
			// que eu quero atualizar, então o meu funcionario que ta na lista recebe as
			// informação(Todas as informações) do meu funcionario atualizado.
			if (this.funcionario.getCpf().equals(funcionario.getCpf())) {
				this.funcionario = funcionario;
			} else {
				this.proximo.atualizar(funcionario);
			}
			// Se ele não encontrar o funcionario que quer atualizar, ent dará erro.
		} else {
			throw new FuncionarioNaoExisteException();
		}
	}

//Meu método existe será chamado lá na classe cadastro para todos os métodos obrigatórios(CADASTRAR, PROCURAR, ATUALIZAR E REMOVER)
	public boolean existe(String cpf) {
		if (this.funcionario != null) {
			if (this.funcionario.getCpf().equals(cpf)) {
				return true;
			} else {
				return this.proximo.existe(cpf);
			}
		} else {
			return false;
		}
	}
}
