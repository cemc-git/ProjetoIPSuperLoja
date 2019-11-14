package Cliente;
import java.util.Scanner;
public class RepositorioClienteArray implements RepositorioCliente {
	
	Cliente repositorioA[] = new Cliente[30];
	private String nome;
	private String cpf;
	private Cliente cliente;
	private Cliente clienteNovo;
	
	
	public void inserir(Cliente cliente) throws ClienteExisteException {
		for (int i = 0; i < repositorioA.length; i++) {
			if(repositorioA[i]==null) {
		   repositorioA[i] = this.cliente;}
			else if(repositorioA[i]==this.cliente) {
				ClienteExisteException erro = new ClienteExisteException(cliente);
				//Cliente ja existe
			}
			else {
				
			}
		}
		
	}

	
	public Cliente buscar(String nome, String cpf)throws ClienteNExisteException {
		Cliente aux=null;
		for (int i = 0; i < repositorioA.length; i++) {
			if (cliente.equals(repositorioA[i])) {
				aux= cliente;
				
			}
			else if (cliente.equals(null)) {
				ClienteNExisteException erro = new ClienteNExisteException(nome,cpf);
				break;
		     //erro aqui, não existe
			}
			else {
			}
			}
		return aux;
		
		}


	
	public boolean existe(String nome, String cpf) {
		boolean aux=false;
              for (int i = 0; i < repositorioA.length; i++) {
				if(cliente.equals(repositorioA[i])) {
					aux=true;
					
				}
				else {
					
				}
			}
              
		return aux;
	}
	public void atualizar(Cliente cliente, Cliente clienteNovo) throws ClienteNAtualizadoException {
		for (int i = 0; i < repositorioA.length; i++) {
			if(cliente.equals(repositorioA[i])) {
				repositorioA[i] = clienteNovo;
				break;
			}
			else if(cliente.equals(null)) {
				ClienteNAtualizadoException erro = new ClienteNAtualizadoException(cliente);
			}
		}
		
	}



	public void remover(Cliente cliente) throws ClienteNAtualizadoException {
		     
		
	}
}
