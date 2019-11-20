package Cliente;

import Venda.RepositorioVenda;
import Pessoa.Pessoa;

public class Cliente extends Pessoa {
    private int desconto;
	public Cliente(String nome, String cpf) {
		super(nome, cpf);
		desconto = 0;
	}

	public void gerarBonus(Pessoa pessoa) {
	 this.setBonus(getBonus()+1);
	 
		if(this.getBonus()>2) {
			this.desconto =this.desconto + 10;	
			this.setBonus(0);
		}	
	}

}
