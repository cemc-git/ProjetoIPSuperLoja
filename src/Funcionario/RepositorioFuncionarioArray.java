package Funcionario;

import Pessoa.Pessoa;

public class RepositorioFuncionarioArray implements RepositorioFuncionario {
//Implements cria os m�todos que minha interface RepositorioFuncionario pede/tem, POIS REPOSITORIOFUNCIONARIOARRAY USAR�	
	private Funcionario[] repositorio;
	//Meu repositorio tem que ser do tipo Funcionario pois ele vai receber os valores do meu objeto Funcionario.
	private int contador;
//2 Atributos, repositorio que � meu array do tipo Funcionario e contador que ser� a posi��o do array.
	public RepositorioFuncionarioArray() {
		this.repositorio = new Funcionario[50]; // Array criado com 50 vagas.
		this.contador = 0;
// this.contador sempre apontar� para uma posi��o vazia!
	}

	public void inserir(Funcionario funcionario) {
		//Eu s� vou inserir um funcion�rio no meu array se l� na minha classe cadastro, no m�todo cadastrar n�o ocorrer o erro quando eu tento cadastrar um funcionario j� cadastrado.
		
		//ARRAY DINAMICO
		if (contador < repositorio.length) {
			repositorio[contador] = funcionario;
			contador++;
		} else {
			Funcionario arrayaux[] = new Funcionario[repositorio.length];
			arrayaux = repositorio;
			repositorio = new Funcionario[2*repositorio.length];
			repositorio = arrayaux;
		}

		// this.contador sempre apontar� para uma posi��o vazia!

	}
/*Do m�todo PROCURAR para frente(ATUALIZAR, REMOVER E EXISTE), todos ir�o usar outro m�todo para verificar
 *  a posi��o do array.Esse m�todo � o getContador, que basicamente funciona como um existir.Ele vai receber
 *   como par�metro um CPF e vai verificar se existe aquele funcionario no array e retorna a POSI��O(INTEIRO) dele!  */
	public Funcionario procurar(String cpf) throws FuncionarioNaoExisteException {
		Funcionario resposta = null; //resposta tem que ser do tipo Funcionario, pois quando achar o funcionario, vou retonar ele(Todas as suas informa��es)
		int i = this.getContador(cpf);// vai para o metodo getContador e joga cpf l�
		if (i == this.contador) {
//Quando i for igual a this.contador, dar� erro(N�o encontrou o funcion�rio, pois this.contador SEMPRE APONTAR� PARA O V�ZIO, OU SEJA, N�O EXISTE FUNCION�RIO NO ARRAY)	
			throw new FuncionarioNaoExisteException();
		} else {
			//Se ele achar o funcionario em questao atrav�s do cpf, retorna todas as informa��es do funcionario
			resposta = this.repositorio[i];
		}
		return resposta;
	}

	private int getContador(String cpf) {
//Private pois usarei esse m�todo SOMENTE NA MINHA CLASSE REPOSIT�RIOARRAY!
		String n; // n receber� um o cpf de um funcionario ques j� est� no array
		boolean achou = false;
		int i = 0;
		while ((!achou) && (i < this.contador)) {
//Se achou for vdd ele entra altomaticamente(mesma coisa que acontece no if)	
			n = repositorio[i].getCpf();//(como repositorio � do tipo Funcionario, eu posso usar get tranquilo!
			if (n.equals(cpf)) {
			//Se o cpf do funcionario que est� na lista for igual ao cpf que eu mandei para o meu m�todo getContador, ent�o ele achou!	
				achou = true;
			} else {
			//Se n�o achou eu somo a i(Posi��o do array) +1, para percorrer o array 	
				i = i + 1;
			}
		}
		return i;
//Se i for igual a this.contador, ele nao encontrou, pois this.contador aponta para o vazio!
	}

	public void atualizar(Funcionario funcionario) throws FuncionarioNaoExisteException {
		int i = this.getContador(funcionario.getCpf());
		//Mando para o m�todo getContador o cpf do meu funcionario que eu entrei para atualizar!
		if (i == this.contador) {
			throw new FuncionarioNaoExisteException();
		//Como this.contador aponta para o vazio, ent ele n�o encontrou ningu�m	
		} else {
		//Caso o funcionario que eu quero atualizar esteja no array, ent�o 	
			this.repositorio[i] = funcionario;
		}
	}

	public void remover(String cpf) throws FuncionarioNaoExisteException {
		int i = this.getContador(cpf);
		if (i == this.contador) {
			throw new FuncionarioNaoExisteException();
		} else {
			this.contador = this.contador - 1;
			this.repositorio[i] = this.repositorio[this.contador];
			this.repositorio[this.contador] = null;
			
		}
	}
	//Meu m�todo existe ser� chamado l� na classe cadastro para todos os m�todos obrigat�rios(CADASTRAR, PROCURAR, ATUALIZAR E REMOVER)
	public boolean existe(String cpf) {
		int i = getContador(cpf);
		if (i == this.contador) {
			return false;
		} else {
			return true;
		}
	}

}
