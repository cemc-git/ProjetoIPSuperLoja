package Cliente;

import Venda.RepositorioVenda;
import Pessoa.Pessoa;

public class Cliente extends Pessoa {
    private double desconto;
	public Cliente(String nome, String cpf) {
		super(nome, cpf);
		desconto = 0;
	}

	public void gerarBonus() {
	 this.setBonus(getBonus()+1);
	 
		if(this.getBonus()>2) {
			this.desconto = this.desconto + 0.9;
			this.setBonus(0);
		}	
	}

}
