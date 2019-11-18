package Venda;

import Funcionario.Funcionario;
import Cliente.Cliente;
import Produto.RepositorioProduto;
import ServicoDeEntrega.ServicoDeEntrega;

public class Venda {

	private Cliente cliente;
	private Funcionario funcionario;
	private RepositorioProduto carrinho;
	private int id;

public Venda(Cliente cliente,Funcionario funcionario,RepositorioProduto carrinho,ServicoDeEntrega frete, int id) {
	this.cliente=  cliente;
	this.funcionario = funcionario;
	this.carrinho= carrinho;
	this.id=id;
}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public RepositorioProduto getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(RepositorioProduto carrinho) {
		this.carrinho  = carrinho;
	}





	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}