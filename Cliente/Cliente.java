package Projeto.Cliente;
import Projeto.Venda.RepositorioVendas;
import Projeto.Pessoa.Pessoa;

public class Cliente extends Pessoa {
	private String codigo;
	public Cliente(String cliente, String cpf,RepositorioVendas historico) {
		super(cliente, cpf, historico);
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
}
