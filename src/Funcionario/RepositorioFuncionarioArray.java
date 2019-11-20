package Funcionario;

import Pessoa.Pessoa;

public class RepositorioFuncionarioArray implements RepositorioFuncionario {
//Implements cria os métodos que minha interface RepositorioFuncionario pede/tem, POIS REPOSITORIOFUNCIONARIOARRAY USARÁ	
	private Funcionario[] repositorio;
	//Meu repositorio tem que ser do tipo Funcionario pois ele vai receber os valores do meu objeto Funcionario.
	private int contador;
//2 Atributos, repositorio que é meu array do tipo Funcionario e contador que será a posição do array.
	public RepositorioFuncionarioArray() {
		this.repositorio = new Funcionario[50]; // Array criado com 50 vagas.
		this.contador = 0;
// this.contador sempre apontará para uma posição vazia!
	}

	public void inserir(Funcionario funcionario) {
		//Eu só vou inserir um funcionário no meu array se lá na minha classe cadastro, no método cadastrar não ocorrer o erro quando eu tento cadastrar um funcionario já cadastrado.
		
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

		// this.contador sempre apontará para uma posição vazia!

	}
/*Do método PROCURAR para frente(ATUALIZAR, REMOVER E EXISTE), todos irão usar outro método para verificar
 *  a posição do array.Esse método é o getContador, que basicamente funciona como um existir.Ele vai receber
 *   como parâmetro um CPF e vai verificar se existe aquele funcionario no array e retorna a POSIÇÃO(INTEIRO) dele!  */
	public Funcionario procurar(String cpf) throws FuncionarioNaoExisteException {
		Funcionario resposta = null; //resposta tem que ser do tipo Funcionario, pois quando achar o funcionario, vou retonar ele(Todas as suas informações)
		int i = this.getContador(cpf);// vai para o metodo getContador e joga cpf lá
		if (i == this.contador) {
//Quando i for igual a this.contador, dará erro(Não encontrou o funcionário, pois this.contador SEMPRE APONTARÁ PARA O VÁZIO, OU SEJA, NÃO EXISTE FUNCIONÁRIO NO ARRAY)	
			throw new FuncionarioNaoExisteException();
		} else {
			//Se ele achar o funcionario em questao através do cpf, retorna todas as informações do funcionario
			resposta = this.repositorio[i];
		}
		return resposta;
	}

	private int getContador(String cpf) {
//Private pois usarei esse método SOMENTE NA MINHA CLASSE REPOSITÓRIOARRAY!
		String n; // n receberá um o cpf de um funcionario ques já está no array
		boolean achou = false;
		int i = 0;
		while ((!achou) && (i < this.contador)) {
//Se achou for vdd ele entra altomaticamente(mesma coisa que acontece no if)	
			n = repositorio[i].getCpf();//(como repositorio é do tipo Funcionario, eu posso usar get tranquilo!
			if (n.equals(cpf)) {
			//Se o cpf do funcionario que está na lista for igual ao cpf que eu mandei para o meu método getContador, então ele achou!	
				achou = true;
			} else {
			//Se não achou eu somo a i(Posição do array) +1, para percorrer o array 	
				i = i + 1;
			}
		}
		return i;
//Se i for igual a this.contador, ele nao encontrou, pois this.contador aponta para o vazio!
	}

	public void atualizar(Funcionario funcionario) throws FuncionarioNaoExisteException {
		int i = this.getContador(funcionario.getCpf());
		//Mando para o método getContador o cpf do meu funcionario que eu entrei para atualizar!
		if (i == this.contador) {
			throw new FuncionarioNaoExisteException();
		//Como this.contador aponta para o vazio, ent ele não encontrou ninguém	
		} else {
		//Caso o funcionario que eu quero atualizar esteja no array, então 	
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
	//Meu método existe será chamado lá na classe cadastro para todos os métodos obrigatórios(CADASTRAR, PROCURAR, ATUALIZAR E REMOVER)
	public boolean existe(String cpf) {
		int i = getContador(cpf);
		if (i == this.contador) {
			return false;
		} else {
			return true;
		}
	}

}
