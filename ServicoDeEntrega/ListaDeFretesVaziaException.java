package projetoLojaHeroi;

public class ListaDeFretesVaziaException extends Exception {
	public ListaDeFretesVaziaException(RepositorioServicoEntrega listaFretes) {
		super ("Não existem fretes em andamento!");	
	}
}
