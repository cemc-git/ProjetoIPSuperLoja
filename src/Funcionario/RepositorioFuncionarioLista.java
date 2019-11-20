package Funcionario;

import Pessoa.Pessoa;

public class RepositorioFuncionarioLista implements RepositorioFuncionario {
	// Implements cria os m�todos que minha interface RepositorioFuncionario
	// pede/tem, POIS REPOSITORIOFUNCIONARIOLISTA USAR�
	private Funcionario funcionario;// Vou passar pra lista meu objeto funcionario
	private RepositorioFuncionarioLista proximo;// referencia para prox lista.

	public RepositorioFuncionarioLista() {
		this.funcionario = null;
		this.proximo = null;
	}

	// Inserior um funcion�rio na minha lista
	public void inserir(Funcionario funcionario) {
		if (this.funcionario.equals(null)) {
			this.funcionario = funcionario;
			this.proximo = new RepositorioFuncionarioLista(); // Aponto para a pr�xima lista encadeada.
		} else {
			this.proximo.inserir(funcionario);
		}
	}

	// Demitir um Funcion�rio � o mesmo que remover um funcion�rio.
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
			// Se this.funcionario==null, isso quer dizer que n�o existe mais funcionario a
			// ser observado na lista, ent�o quer dizer que n�o encontrou ningu�m pra
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
			// Se this.funcionario==null, isso quer dizer que n�o existe mais funcionario a
			// ser observado na lista, ent�o quer dizer que n�o encontrou ningu�m.
		} else {
			throw new FuncionarioNaoExisteException();
		}
	}

	public void atualizar(Funcionario funcionario) throws FuncionarioNaoExisteException {
		if (this.funcionario != null) {
			// Se o cpf do funcionario da lista em questao for igual ao cpf do funcionario
			// que eu quero atualizar, ent�o o meu funcionario que ta na lista recebe as
			// informa��o(Todas as informa��es) do meu funcionario atualizado.
			if (this.funcionario.getCpf().equals(funcionario.getCpf())) {
				this.funcionario = funcionario;
			} else {
				this.proximo.atualizar(funcionario);
			}
			// Se ele n�o encontrar o funcionario que quer atualizar, ent dar� erro.
		} else {
			throw new FuncionarioNaoExisteException();
		}
	}

//Meu m�todo existe ser� chamado l� na classe cadastro para todos os m�todos obrigat�rios(CADASTRAR, PROCURAR, ATUALIZAR E REMOVER)
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
