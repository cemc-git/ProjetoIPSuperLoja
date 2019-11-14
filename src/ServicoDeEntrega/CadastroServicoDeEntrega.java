package ServicoDeEntrega;

public class CadastroServicoDeEntrega {
	private RepositorioServicoEntrega fretes;
	private int contador;

	public CadastroServicoDeEntrega(RepositorioServicoEntrega repositorioFretes) {
		this.fretes = repositorioFretes;
		this.contador=0;
	}

	public int getContador() {
		return contador;
	}

	public void cadastrarFrete(ServicoDeEntrega frete) throws FreteJaExistenteException, FreteVazioException, DIException {
		
		if (frete == null) {
			throw new FreteVazioException();
		}else if (frete.getDistancia()<0) {
			throw new DIException(frete.getDistancia());
		} 
		else if (!fretes.existeFrete(frete.getIdentificador())) {
			fretes.inserirFrete(frete);
			contador++;
		} else {
			throw new FreteJaExistenteException();
		}
	}
}
