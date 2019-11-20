package Main;
import java.util.Scanner;
import Cliente.CadastroCliente;
import Cliente.CamposInvalidoException;
import Cliente.Cliente;
import Cliente.ClienteExisteException;
import Cliente.ClienteNAtualizadoException;
import Cliente.ClienteNExisteException;
import Cliente.ClienteNRemovidoException;
import Cliente.RepositorioCliente;
import Cliente.RepositorioClienteArray;
import Cliente.RepositorioClienteLista;
import Funcionario.CadastroFuncionario;
import Funcionario.Funcionario;
import Funcionario.FuncionarioCadastradoException;
import Funcionario.FuncionarioNaoExisteException;
import Funcionario.RepositorioFuncionario;
import Funcionario.RepositorioFuncionarioArray;
import Funcionario.RepositorioFuncionarioLista;
//import Produto.CadastroProduto;//
import ServicoDeEntrega.CadastroServicoDeEntrega;
import ServicoDeEntrega.DIException;
import ServicoDeEntrega.FreteInexistenteException;
import ServicoDeEntrega.FreteJaExistenteException;
import ServicoDeEntrega.FreteVazioException;
import ServicoDeEntrega.IdentException;
import ServicoDeEntrega.RepositorioServicoEntrega;
import ServicoDeEntrega.RepositorioServicosEntregaLista;
import ServicoDeEntrega.RepositorioServicosEntregasArray;
import ServicoDeEntrega.ServicoDeEntrega;
import ServicoDeEntrega.tipoEntException;
import Venda.BuscaIdException;
import Venda.CadastroVenda;
import Venda.InserirExistenteException;
import Venda.PessoaNaoCadastradoException;
import Venda.RepositorioVenda;
import Venda.RepositorioVendaArray;
import Venda.RepositorioVendaLista;
import Venda.Venda;
import Venda.VendaNaoEncontradaException;
import Cliente.RepositorioCliente;
import Fachada.Fachada;
import ServicoDeEntrega.RepositorioServicoEntrega;

public class main {
	public static void main(String[] args) throws ClienteExisteException, CamposInvalidoException {
	   Scanner in = new Scanner(System.in);
	   
	                          //Usando repositorio tipo Lista
    CadastroCliente clientes = new CadastroCliente(new RepositorioClienteLista());
   CadastroFuncionario	funcionarios = new CadastroFuncionario(new RepositorioFuncionarioLista());
   CadastroVenda vendas = new CadastroVenda(new RepositorioVendaLista());
   CadastroServicoDeEntrega fretes = new CadastroServicoDeEntrega(new RepositorioServicosEntregaLista());
  // CadastroProduto produtos = new CadastroProdutos(new RepositorioProdutosLista());
   
   
                             //Usando repositorio tipo array
  // CadastroCliente clientes = new CadastroCliente(new RepositorioClienteArray());
 //  CadastroFuncionario	funcionarios = new CadastroFuncionario(new RepositorioFuncionarioArray());
  // CadastroVenda vendas = new CadastroVenda(new RepositorioVendaArray());
  // CadastroServicoDeEntrega fretes = new CadastroServicoDeEntrega(new RepositorioServicosEntregasArray());
  // CadastroProduto produtos = new CadastroProdutos(new RepositorioProdutosArray())
   Fachada fachada = new Fachada(clientes,funcionarios,vendas,fretes/*produtos*/);
   
  //Cadastrando Clientes
	   fachada.cadastrarCliente(new Cliente("Carlitos","11281994405"));
	   fachada.cadastrarCliente(new Cliente("João Marcos","13277744444"));
       fachada.cadastrarCliente(new Cliente("Jose da Luz","132777445674"));
	//Cadastrando Funcionarios
       
	   
	   
	   
	   

   
   
	   
	   
		
		

	}

}
