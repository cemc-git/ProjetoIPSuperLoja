package Venda;

import Cliente.RepositorioCliente;

import Funcionario.RepositorioFuncionario;
import Pessoa.Pessoa;
import Funcionario.Funcionario;





public class CadastroVenda {
	private RepositorioVenda repo;

	
	public CadastroVenda(RepositorioVenda repositorioVenda) {
		this.repo = repositorioVenda;
	}
	
	
	public void cadastrar(Venda venda, RepositorioCliente clientesCadastrados, RepositorioFuncionario funcionarios)
			throws InserirExistenteException, PessoaNaoCadastradoException {
		if (repo.existe(venda)) {
			//erro de venda ja existente
			InserirExistenteException e = new InserirExistenteException(venda);
			throw e;
		} else if (!clientesCadastrados.existe(venda.getCliente().getNome(), venda.getCliente().getCpf())) {
			// erro de cliente nao cadastrado
			PessoaNaoCadastradoException e = new PessoaNaoCadastradoException(venda.getCliente(), "Cliente");
			throw e;
		} else if (!funcionarios.existe(venda.getFuncionario().getCpf())) {
			// erro de funcionario nao cadastrado
			PessoaNaoCadastradoException e = new PessoaNaoCadastradoException(venda.getFuncionario(), "Funcionário");
			throw e;
		}

		
		else {
			repo.inserir(venda);
		}

	}
	
	
	
	public boolean existe(Venda venda) {
		
		return repo.existe(venda);
	
	}
	
	
	
	public Venda buscar(int id) throws BuscaIdException {
		
		return repo.buscar(id);
		
		
	}

	
	
	
	public void atualizar(Venda vendaAntiga, Venda vendaAtualizada) throws VendaNaoEncontradaException{
		
		repo.atualizar(vendaAntiga, vendaAtualizada);
		
	}
	
	
	public void remover ( Venda venda) throws VendaNaoEncontradaException{
		repo.remover(venda);
		
	}
}
