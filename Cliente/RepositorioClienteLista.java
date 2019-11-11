package Projeto.Cliente;
public class RepositorioClienteLista implements RepositorioCliente   {
	private String nome;
	private String cpf;
	private RepositorioClienteLista prox;
	private Cliente cliente;
	
	public void construtor() {
		this.cliente=null;
		this.cpf = null;
		this.prox=null;
		this.nome=null;
	}
	
	

	public void inserir(Cliente cliente) {
		if(this.nome.equals(null)) {
	         this.cliente = cliente;
	         this.prox = new RepositorioClienteLista();
			}
			else if(this.cliente.equals(cliente)) {
				//cliente ja cadastrado
			}
			else {
				this.prox.inserir(cliente);}
		
	}

	
	public Cliente buscar(String nome, String cpf) {
		if(this.nome.equals(nome)) {
		    return cliente;
		}
		else if (this.cliente.equals(null)) {
			
			//Nao existe esse cliente
		}
		else {
			return this.prox.cliente;
		}
		return null;
	}

	
	public boolean existe(String nome, String cpf) {
		if(cliente.equals(this.cliente)) {
			return true;
		}
		else if (cliente.equals(null)) {
			return false;
		}
		else {
			return this.prox.existe(nome,cpf);
			
		}
		
	}

	
	public void atualizar(Cliente cliente, Cliente clienteNovo) {
		if(cliente.equals(clienteNovo)) {
			this.cliente = clienteNovo;
		}
		else if(cliente.equals(null)) {
			//vai dar erro ou n atualizar no caso
		}
		else {
			this.prox.atualizar(cliente, clienteNovo);
		}
	}
	

	


	

	
	
	
}
