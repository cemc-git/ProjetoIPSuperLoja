package projetoLojaHeroi;

public class FreteInexistenteException extends Exception {
	public FreteInexistenteException(RepositorioServicoEntrega listaFretes) {
		super ("O Frete procurado não existe!");
	}
}

