package Cliente;

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
	
	

	public void inserir(Cliente cliente) throws ClienteExisteException {
		if(this.nome.equals(null)) {
	         this.cliente = cliente;
	         this.prox = new RepositorioClienteLista();
			}
			else if(this.cliente.equals(cliente)) {
				ClienteExisteException erro = new ClienteExisteException(cliente);
				//cliente existe
			}
			else {
				this.prox.inserir(cliente);}
		
	}

	
	



	public Cliente buscar(String nome, String cpf)throws ClienteNExisteException {
		if(this.nome.equals(nome)) {
		    return cliente;
		}
		else if (this.cliente.equals(null)) {
			ClienteNExisteException erro=new ClienteNExisteException(this.nome,this.cpf);
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

	
	public void atualizar(Cliente cliente, Cliente clienteNovo) throws ClienteNAtualizadoException {
		if(cliente.equals(this.cliente)) {
			this.cliente = clienteNovo;
		}
		else if(cliente.equals(null)) {
			ClienteNAtualizadoException erro = new ClienteNAtualizadoException(cliente);
			//vai dar erro ou n atualizar no caso
		}
		else {
			this.prox.atualizar(cliente, clienteNovo);
		}
	}



	
	public void remover(Cliente cliente) throws ClienteNAtualizadoException {
		if(cliente.equals(this.cliente)) {
		    this.cliente =this.prox.cliente;
		    this.prox = this.prox.prox;
		}
		else if (cliente.equals(null)) {
			ClienteNAtualizadoException erro = new ClienteNAtualizadoException(cliente);
		}
		else {
			this.prox.remover(cliente);
		}
		
	}
	

	


	

	
	
	
}
