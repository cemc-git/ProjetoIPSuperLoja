package Venda;

public class RepositorioVendasArray implements RepositorioVendas  {
private Venda[] repositorio;
private int cont;
private int tam;
public RepositorioVendasArray(int tam) {
	this.tam=tam;
	this.repositorio=new Venda[this.tam];
	this.cont =0;
	
	for (int i = 0; i < repositorio.length; i++) {
		repositorio[i]=null;
	}
	
}



public void inserir(Venda venda)  {
	if (cont>=repositorio.length) {
		
		
				Venda[] aux =new Venda[repositorio.length+1];
				for (int i = 0; i < repositorio.length ; i++) {
					aux[i]=repositorio[i];
				}
		this.repositorio=aux;
		inserir(venda);
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


public Venda buscar(int id) throws BuscaIdException {
Venda aux=null;
for (int i = 0; i < repositorio.length; i++) {

	if (repositorio[i].getId()==id) {
		aux=repositorio[i];
	}
	
}
if (aux==null) {
	BuscaIdException e= new BuscaIdException(id);
	throw e;
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
public void atualizar(Venda vendaAntiga, Venda vendaAtualizada) throws VendaNaoEncontradaException {
	boolean executado=false;
	for (int i = 0; i < repositorio.length && repositorio[i]!=null&&!executado; i++) {
		if (repositorio[i].equals(vendaAntiga)) {
			repositorio[i]=vendaAtualizada;
			executado=true;
		}
	}
	if (!executado) {
		VendaNaoEncontradaException e =new VendaNaoEncontradaException(vendaAntiga);
		throw e;
	}
	
}
	
	
}
