package projeto;

public class RepositorioServicosEntregasArray implements RepositorioServicoEntrega {
	private ServicoDeEntrega fretes[];
	private int indice;
	
	public RepositorioServicosEntregasArray(int tam) {
		fretes=new ServicoDeEntrega[tam];		
	}
	@Override
	public void inserirFrete(ServicoDeEntrega frete) throws FreteVazioException {//EXCEPTION "FRETE" VAZIO
		// TODO Auto-generated method stub
		
		if (frete==null) {
			throw new FreteVazioException(frete);
		}
		if (indice<=fretes.length) {
			fretes[indice]=frete;
			indice++;
		}else {
			ServicoDeEntrega aux[]=new ServicoDeEntrega[fretes.length];
			aux=fretes;
			fretes=new ServicoDeEntrega[fretes.length*2];
			fretes=aux;
		}
		
	}
	public boolean existeFrete(ServicoDeEntrega frete) {// EXCEPTION NAO EXISTE "FRETE" PROCURADO
		// TODO Auto-generated method stub
		boolean existeFrete=false;
		for (int i = 0; i < fretes.length; i++) {
			if (fretes[i]==frete) {
				existeFrete=true;
			}
		}	
		return existeFrete;
	}
	@Override
	public void removerFrete(ServicoDeEntrega frete) throws FreteInexistenteException {
		// TODO Auto-generated method stub
		for (int i = 0; i < fretes.length; i++) {
			if (fretes[i]==frete) {
				fretes[i]=null;
			}
		}
	}
	@Override
	public ServicoDeEntrega procurarFrete(ServicoDeEntrega frete) throws FreteInexistenteException {
		// TODO Auto-generated method stub
		ServicoDeEntrega freteRetornado=null;
		for (int i = 0; i < fretes.length; i++) {
			if (fretes[i]==frete) {
				freteRetornado=fretes[i];
		}
	}
		if (freteRetornado==null) {
			throw new FreteInexistenteException(frete);
		}else {
			return freteRetornado;
		}
	}
	@Override
	public void atualizarFrete(ServicoDeEntrega frete, ServicoDeEntrega newFrete) throws FreteInexistenteException {
		// TODO Auto-generated method stub
		boolean atualizou=false;
		for (int i = 0; i < fretes.length; i++) {
			if (fretes[i]==frete) {
				fretes[i]=newFrete;
				atualizou=true;
			}
		}if (atualizou) {
			throw new FreteInexistenteException(frete);
		}
	}
	
}
