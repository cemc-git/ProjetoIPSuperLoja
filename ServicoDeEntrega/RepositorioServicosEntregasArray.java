package ServicoDeEntrega;

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

	@Override
	public boolean procurarFrete(ServicoDeEntrega frete)throws FreteInexistenteException {// EXCEPTION NAO EXISTE "FRETE" PROCURADO
		// TODO Auto-generated method stub
		boolean existeFrete=false;
		for (int i = 0; i < fretes.length; i++) {
			if (fretes[i]==frete) {
				existeFrete=true;
			}
		}
		if (existeFrete==false) {
			throw new FreteInexistenteException(frete);
		}
		return existeFrete;
	}

	@Override
	public String listarFrete()throws ListaDeFretesVaziaException {// EXCEPTION NAO EXISTEM FRETES 
		// TODO Auto-generated method stub
		String listaFretes="";
		for (int i = 0; i < fretes.length; i++) {
			listaFretes="---------------\n"+"->"+fretes[i].getVenda().getCliente()+"\n"+"->"+fretes[i].getVenda().getFuncionario()+"\n"+"->"+fretes[i].getTipoDeEntrega()+"\n"+"->"+fretes[i].getDistancia()+"\n";
		}
		if (listaFretes=="") {
			throw new ListaDeFretesVaziaException();
		}
		return listaFretes;
	}

}
