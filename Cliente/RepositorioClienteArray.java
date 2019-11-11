package Projeto.Cliente;
import java.util.Scanner;
public class RepositorioClienteArray implements RepositorioCliente {
	
	Cliente repositorioA[] = new Cliente[30];
	private String nome;
	private String cpf;
	private Cliente cliente;
	private Cliente clienteNovo;
	
	
	public void inserir(Cliente cliente) {
		for (int i = 0; i < repositorioA.length; i++) {
			if(repositorioA[i]==null) {
		   repositorioA[i] = this.cliente;}
			else if(repositorioA[i]==this.cliente) {
				//Cliente ja existe
			}
			else {
				
			}
		}
		
	}

	
	public Cliente buscar(String nome, String cpf) {
		Cliente aux=null;
		for (int i = 0; i < repositorioA.length; i++) {
			if (cliente.equals(repositorioA[i])) {
				aux= cliente;
				
			}
			else if (cliente.equals(null)) {
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
	public void atualizar(Cliente cliente, Cliente clienteNovo) {
		for (int i = 0; i < repositorioA.length; i++) {
			if(cliente.equals(repositorioA[i])) {
				repositorioA[i] = clienteNovo;
				
			}
		}
		
	}
}
