package Cliente;

import Venda.RepositorioVenda;
import Pessoa.Pessoa;

public class Cliente extends Pessoa {

	public Cliente(String nome, String cpf, int bonus) {
		super(nome, cpf, bonus);
	}

	public void gerarBonus(Pessoa pessoa) {
		//Supondo que a fachada aumenta o bonus da pessoa então
		if(this.getBonus()>3) {
			
			//diminui % do valor total
			
		}
		
		
	}

}
