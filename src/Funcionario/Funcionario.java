package Funcionario;

import Pessoa.Pessoa;

//Funcionário é minha classe básica e herda Pessoa como classe abstrata(Herdo todas seus atributos)
public class Funcionario extends Pessoa {
	// Atributos de Funcionário
	private double salario;

	// Construtor Funcionario
	public Funcionario(String nome, String cpf, double salario) {
		super(nome, cpf);
		this.salario = salario;// igualei this.salario a salario pq o o salario vai ser colocado pelo usuario
								// no main
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

//Meu método gerarBonus vai trabalhar em cima do atributo bonus.
	public void gerarBonus() {
		setBonus(getBonus() + 1);

		if (getBonus() >= 10) {
			setSalario(this.getSalario() + 100);
			setBonus(0);
		}

	}
}
