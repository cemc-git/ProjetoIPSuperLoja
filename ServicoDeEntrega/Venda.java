package projetoLojaHeroi;

public class Venda {
private Cliente cliente;
private Funcionario funcionario;
private RepositorioProdutos carrinho;
private ServicoDeEntrega frete;
	
public Venda(Cliente cliente,Funcionario funcionario,RepositorioProdutos carrinho,ServicoDeEntrega frete) {
	this.Cliente cliente=Cliente cliente;
	this.Funcionario funcionario=Funcionario funcionario;
	this.RepositorioProdutos carrinho=RepositorioProdutos carrinho;
	this.ServicoDeEntrega frete=ServicoDeEntrega frete;
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

public RepositorioProdutos getCarrinho() {
	return carrinho;
}

public void setCarrinho(RepositorioProdutos carrinho) {
	this.carrinho = carrinho;
}

public ServicoDeEntrega getFrete() {
	return frete;
}

public void setFrete(ServicoDeEntrega frete) {
	this.frete = frete;
}	
	
	
	
}
