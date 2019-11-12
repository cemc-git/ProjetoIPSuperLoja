package Cliente;
import Venda.RepositorioVendas;
import Pessoa.Pessoa;

public class Cliente extends Pessoa {
	
	public Cliente(String cliente, String cpf,int bonus) {
		super(cliente, cpf, bonus);
	}
	public void GerarBonus(Pessoa pessoa){
		if (pessoa.getBonus()>3) {
			
		}
	}
	
	
	
}
