package projeto;

public class RepositorioVendasArray implements RepositorioVendas {
private Venda[] repositorio;
private int cont;

public RepositorioVendasArray(int tam) {
	
	this.repositorio=new Venda[tam];
	this.cont=tam-1;
	
	for (int i = 0; i < repositorio.length; i++) {
		repositorio[i]=null;
	}
	
}



public void inserir(Venda venda) {
	if (cont>=repositorio.length) {
		//erro de limite do array
	}else {
		repositorio[cont]=venda;
		cont++;
	}
	
}




public boolean existe(Venda venda) {
	boolean aux =false;
	
	for (int i = 0; i < repositorio.length && repositorio[i]!=null && !aux; i++) {
		
		if (repositorio[i].equals(venda)) {
			aux=true;
		}
		
		
		
	}
	
	
	return aux;
}


public Venda buscar(int id) {
Venda aux=null;
for (int i = 0; i < repositorio.length; i++) {

	if (repositorio[i].getId()==id) {
		aux=repositorio[i];
	}
	
}
	
	
	
	
	return aux;
}
	
public int getCont() {
	return cont;
}



public void setCont(int cont) {
	this.cont = cont;
}



@Override
public void atualizar(Venda vendaAntiga, Venda vendaAtualizada) {
	boolean executado=false;
	for (int i = 0; i < repositorio.length && repositorio[i]!=null&&!executado; i++) {
		if (repositorio[i].equals(vendaAntiga)) {
			repositorio[i]=vendaAtualizada;
			executado=true;
		}
	}
	if (!executado) {
		//nao encontrou
	}
	
}
	
	
}
