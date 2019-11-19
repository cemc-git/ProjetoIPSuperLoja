package Cliente;

import java.util.Scanner;

public class RepositorioClienteArray implements RepositorioCliente {

	Cliente repositorioA[] = new Cliente[10];
	
	private Cliente cliente;
	

	public void inserir(Cliente cliente) throws ClienteExisteException {
		for (int i = 0; i < repositorioA.length; i++) {
			if (repositorioA[i].equals(null)) {
				repositorioA[i] = this.cliente;
			} else if (repositorioA[i].equals(this.cliente)) {
				
				// Cliente ja existe
			} else {

			}
		}

	}

	public Cliente buscar(String nome, String cpf) throws ClienteNExisteException {
		Cliente aux = null;
		for (int i = 0; i < repositorioA.length; i++) {
			if (cliente.equals(repositorioA[i])) {
				aux = cliente;

			} else if (cliente.equals(null)) {
				ClienteNExisteException erro = new ClienteNExisteException(nome, cpf);
				break;
				// erro aqui, não existe
			} else {
			}
		}
		return aux;

	}

	public boolean existe(String nome, String cpf) {
		boolean aux = false;
		for (int i = 0; i < repositorioA.length; i++) {
			if (cliente.equals(repositorioA[i])) {
				aux = true;

			} else {

			}
		}

		return aux;
	}

	public void atualizar(Cliente cliente, Cliente clienteNovo) throws ClienteNAtualizadoException {
		for (int i = 0; i < repositorioA.length; i++) {
			if (cliente.equals(repositorioA[i])) {
				repositorioA[i] = clienteNovo;
				break;
			} else if (cliente.equals(null)) {
				ClienteNAtualizadoException erro = new ClienteNAtualizadoException(cliente);
			}
		}

	}

	public void remover(Cliente cliente) throws ClienteNRemovidoException {
		int contador=0;
		for (contador=0; contador < repositorioA.length; contador++) {
			if(cliente.equals(null)) {
				break;
			}
			else {
				
			}
		}
		for (int i = 0; i < repositorioA.length; i++) {
			if (cliente.equals(repositorioA[i])) {
		      repositorioA[i]= repositorioA[contador-1];
              repositorioA[contador-1]=null;
              break;
			}
			else if(i==repositorioA.length-1) {
				ClienteNRemovidoException erro = new ClienteNRemovidoException(cliente);
			}
		}

	}
}
