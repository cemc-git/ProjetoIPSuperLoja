package ServicoDeEntrega;

public class RepositorioServicosEntregaLista implements RepositorioServicoEntrega {
	private ServicoDeEntrega frete;
	private RepositorioServicosEntregaLista proximo;

	public RepositorioServicosEntregaLista() {
		this.frete = null;
		this.proximo = null;
	}

	public ServicoDeEntrega getFrete() {
		return frete;
	}

	public RepositorioServicosEntregaLista getProximo() {
		return proximo;
	}

	@Override
	public void inserirFrete(ServicoDeEntrega frete)  throws FreteVazioException,FreteJaExistenteException{ // EXCEPTION INSERIR "FRETE" VAZIO
		// TODO Auto-generated method stub
		if (frete == null) {
			throw new FreteVazioException(frete);
		} else if (this.frete==frete) {
			throw new FreteJaExistenteException(frete);
		}else if (this.frete == null) {
			this.frete = frete;
			this.proximo = new RepositorioServicosEntregaLista();
		} else {
			this.proximo.inserirFrete(frete);
		}
	}

	@Override
	public boolean procurarFrete(ServicoDeEntrega frete) throws FreteInexistenteException { // EXCEPTION NAO EXISTE "FRETE" PROCURADO
		// TODO Auto-generated method stub
		boolean existeFrete = false;
		if (this.frete != null) {
			if (this.frete == frete) {
				existeFrete = true;
			} else {
				this.proximo.procurarFrete(frete);
			}		
		}else {
			throw new FreteInexistenteException(frete);
		}
		return existeFrete;
	}

	@Override
	public String listarFrete() throws ListaDeFretesVaziaException{// EXCEPTION NAO EXISTEM FRETES
		// TODO Auto-generated method stub
		String listarFretes = "";
		if (this.frete != null) {
			listarFretes = "---------------\n" + "->" + this.frete.getVenda().getCliente() + "\n" + "->"
					+ this.frete.getVenda().getFuncionario() + "\n" + "->" + this.frete.getTipoDeEntrega() + "\n" + "->"
					+ this.frete.getDistancia() + "\n";
		}
		if (listarFretes=="") {
			throw new ListaDeFretesVaziaException();
		}
		return listarFretes;
	}

}
