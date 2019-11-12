package projeto;

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
	public void inserirFrete(ServicoDeEntrega frete) throws FreteVazioException { // EXCEPTION																												// INSERIR																												// "FRET																											// VAZIO
		// TODO Auto-generated method stub
		if (frete == null) {
			throw new FreteVazioException(frete);
		}else if (this.frete == null) {
			this.frete = frete;
			this.proximo = new RepositorioServicosEntregaLista();
		} else {
			this.proximo.inserirFrete(frete);
		}
	}

	@Override
	public boolean existeFrete(ServicoDeEntrega frete) { // EXCEPTION NAO EXISTE // "FRETE" PROCURADO
		// TODO Auto-generated method stub
		boolean existeFrete = false;
		if (this.frete != null) {
			if (this.frete == frete) {
				existeFrete = true;
			} else {
				this.proximo.existeFrete(frete);
			}
		}
		return existeFrete;
	}

	@Override
	public void removerFrete(ServicoDeEntrega frete) throws FreteInexistenteException {
		// TODO Auto-generated method stub
		if (this.frete != null) {
			if (this.frete == frete) {
				this.frete = this.proximo.frete;
				this.proximo = this.proximo.proximo;
			} else {
				this.proximo.removerFrete(frete);
			}
		}
	}

	@Override
	public ServicoDeEntrega procurarFrete(ServicoDeEntrega frete) throws FreteInexistenteException {
		// TODO Auto-generated method stub
		if (this.frete == frete) {
			return this.frete;
		} else {
			return this.proximo.procurarFrete(frete);
		}
	}

	@Override
	public void atualizarFrete(ServicoDeEntrega frete, ServicoDeEntrega newFrete) throws FreteInexistenteException {
		// TODO Auto-generated method stub
		if (this.frete == frete) {
			this.frete = newFrete;
		} else {
			this.proximo.atualizarFrete(frete, newFrete);
		}
	}

}
