package projetoLojaHeroi;

public class RepositorioServicosEntregasArray implements RepositorioServicoEntrega {
	private ServicoDeEntrega fretes[];
	private int indice;
	
	public RepositorioServicosEntregasArray(int tam) {
		fretes=new ServicoDeEntrega[tam];
	}
	@Override
	public void inserirFrete(ServicoDeEntrega frete) {//EXCEPTION "FRETE" VAZIO
		// TODO Auto-generated method stub
		fretes[indice]=frete;
		indice++;
	}

	@Override
	public boolean procurarFrete(ServicoDeEntrega frete) {// EXCEPTION NAO EXISTE "FRETE" PROCURADO
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
	public String listarFrete() {// EXCEPTION NAO EXISTEM FRETES 
		// TODO Auto-generated method stub
		String listaFretes="";
		for (int i = 0; i < fretes.length; i++) {
			listaFretes="---------------\n"+"->"+fretes[i].getVenda().getCliente()+"\n"+"->"+fretes[i].getVenda().getFuncionario()+"\n"+"->"+fretes[i].getTipoDeEntrega()+"\n"+"->"+fretes[i].getDistancia()+"\n";
		}
		return listaFretes;
	}

}
