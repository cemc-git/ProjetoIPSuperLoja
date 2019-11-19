package Fachada;

import Cliente.RepositorioClienteArray;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fachada f = new Fachada();
		System.out.println("Qual o tipo do seu repositorio?");
		int tipo = in.nextInt();
		if(tipo == 0) {
			RepositorioClienteArray repositorioClienteArray = new RepositorioClienteArray();
			Fachada f = new Fachada(repositorioClienteArray);
		}
	}

}
