package Funcionario;

import Pessoa.Pessoa;

//Funcion�rio como classe que Herda Pesssoa
public class Funcionario extends Pessoa {
//Atributos Funcion�rio	
	private int comissao;
	private int nivel;
	private Funcionario proximo;

//Construtor Funcionario
	public Funcionario(int comissao, int nivel, String nome, String cpf, int bonus) {
		super(nome, cpf, bonus);
		this.comissao = 0;
		this.nivel = 1;
		this.proximo = null;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
    
	
	public boolean equals(Funcionario outro) {
	if(this.getCpf().equals(outro.getCpf()))	{
		return true;
	} else {
		return false;
	}
	}
	
	
	
}
	
	
	


