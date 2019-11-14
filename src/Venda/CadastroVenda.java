package Venda;
import Cliente.RepositorioCliente;
import Funcionario.RepositorioFuncionario;
import Pessoa.Pessoa;
import Funcionario.Funcionario;
public class CadastroVenda {
	private RepositorioVenda repo;

public void cadastrar(Venda venda,RepositorioCliente clientesCadastrados,RepositorioFuncionario funcionarios) throws InserirExistenteException,PessoaNaoCadastradoException {
	if (repo.existe(venda)) {
		InserirExistenteException e =new InserirExistenteException(venda);
		throw e;
	}else if (!clientesCadastrados.existe(venda.getCliente().getNome(),venda.getCliente().getCpf())) {
		//erro de cliente nao cadastrado
		PessoaNaoCadastradoException e=new PessoaNaoCadastradoException(venda.getCliente(),"Cliente");
		throw e;
	}else if (!funcionarios.existe(venda.getFuncionario().getCpf())) {
		//erro de funcionario nao cadastrado
		PessoaNaoCadastradoException e=new PessoaNaoCadastradoException( venda.getFuncionario(),"Funcion�rio");
		throw e;
	}
	
	
	//tem que colocar erro de produto estar no carrinho e nao estar no estoque
	else {
		repo.inserir(venda);
	}
	
	
}

}
