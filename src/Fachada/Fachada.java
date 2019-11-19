package Fachada;

import Cliente.CadastroCliente;
import Cliente.CamposInvalidoException;
import Cliente.Cliente;
import Cliente.ClienteExisteException;
import Cliente.ClienteNAtualizadoException;
import Cliente.ClienteNExisteException;
import Cliente.ClienteNRemovidoException;
import Cliente.RepositorioCliente;
import Funcionario.CadastroFuncionario;
import Funcionario.Funcionario;
import Funcionario.FuncionarioCadastradoException;
import Funcionario.FuncionarioNaoExisteException;
import Funcionario.RepositorioFuncionario;
//import Produto.CadastroProduto;//
import ServicoDeEntrega.CadastroServicoDeEntrega;
import ServicoDeEntrega.DIException;
import ServicoDeEntrega.FreteInexistenteException;
import ServicoDeEntrega.FreteJaExistenteException;
import ServicoDeEntrega.FreteVazioException;
import ServicoDeEntrega.IdentException;
import ServicoDeEntrega.RepositorioServicoEntrega;
import ServicoDeEntrega.ServicoDeEntrega;
import ServicoDeEntrega.tipoEntException;
import Venda.BuscaIdException;
import Venda.CadastroVenda;
import Venda.InserirExistenteException;
import Venda.PessoaNaoCadastradoException;
import Venda.RepositorioVenda;
import Venda.Venda;
import Venda.VendaNaoEncontradaException;

public class Fachada {
	private CadastroCliente cliente;
	private CadastroVenda venda;
	private CadastroServicoDeEntrega frete;
	private CadastroFuncionario funcionario;
	
	// private CadastroProduto produto//

	public Fachada(RepositorioCliente repositorioCliente, RepositorioServicoEntrega repositorioServicoDeEntrega,RepositorioVenda repositorioVenda, RepositorioFuncionario repositoriofuncionario) {
		this.cliente = new CadastroCliente(repositorioCliente);
		this.frete = new CadastroServicoDeEntrega(repositorioServicoDeEntrega);
		this.venda= new CadastroVenda(repositorioVenda);
		this.funcionario= new CadastroFuncionario(repositoriofuncionario);
	}

	public void cadastrarCliente(Cliente cliente) throws ClienteExisteException, CamposInvalidoException {
		this.cliente.cadastrar(cliente);
	}

	public Cliente buscarCliente(String nome, String cpf) throws ClienteNExisteException {
		return this.cliente.buscar(nome, cpf);
	}

	public boolean existeCliente(String nome, String cpf) {
		return this.cliente.existe(nome, cpf);
	}

	public void removerCliente(Cliente cliente) throws ClienteNRemovidoException {
		this.cliente.remover(cliente);
	}

	public void atualizarCliente(Cliente cliente, Cliente clienteNovo) throws ClienteNAtualizadoException {
		this.cliente.atualizar(cliente, clienteNovo);
	}

	
	
	
	public void cadastrarServicoDeEntrega(ServicoDeEntrega frete)
			throws FreteJaExistenteException, FreteVazioException, DIException, IdentException, tipoEntException {
		this.frete.cadastrarFrete(frete);
	}

	public boolean existeServicoDeEntrega(int identificador) throws IdentException {
		return this.frete.existeFrete(identificador);
	}

	public void removerServicoDeEntrega(int identificador) throws FreteInexistenteException, IdentException {
		this.frete.removerFrete(identificador);
	}

	public ServicoDeEntrega procurarServicoDeEntrega(int identificador)
			throws FreteInexistenteException, IdentException {
		return this.frete.procurarFrete(identificador);
	}

	public void atualizarServicoDeEntrega(int identificador, ServicoDeEntrega newFrete)
			throws FreteInexistenteException, IdentException {
		this.frete.atualizarFrete(identificador, newFrete);
	}

	public void cadastrarVenda(Venda venda,RepositorioCliente clientesCadastrados,RepositorioFuncionario funcionarios) throws InserirExistenteException, PessoaNaoCadastradoException {
		this.venda.cadastrar(venda, clientesCadastrados, funcionarios);
	}
	public boolean existeVenda(Venda venda) {
		return this.venda.existe(venda);
	}
	public void removerVenda(Venda venda) throws VendaNaoEncontradaException {
		this.venda.remover(venda);
	}
	public Venda buscarVenda(int id) throws BuscaIdException {
		return this.venda.buscar(id);
	}
	public void atualizarVenda(Venda vendaAntiga,Venda vendaAtualizada) throws VendaNaoEncontradaException {
		this.venda.atualizar(vendaAntiga, vendaAtualizada);
	}
	
	

	public void cadastrarfuncionario(Funcionario funcionario) throws FuncionarioCadastradoException {
		this.funcionario.cadastrar(funcionario);
	}
	
	public void removerfuncionario(Funcionario funcionario) throws FuncionarioNaoExisteException {
		this.funcionario.remover(funcionario);
	}
	public Funcionario procurarfuncionario(Funcionario funcionario) throws FuncionarioNaoExisteException {
		return this.funcionario.procurar(funcionario);
	}
	public void atualizarfuncionario(Funcionario funcionario) throws FuncionarioNaoExisteException {
		this.funcionario.atualizar(funcionario);
	}
	
	
	
	
	
	
	
}
