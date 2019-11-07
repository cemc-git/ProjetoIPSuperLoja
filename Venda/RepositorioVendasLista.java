package projeto;

public class RepositorioVendasLista implements RepositorioVendas {
private Venda venda;
private RepositorioVendasLista prox;
	
	public RepositorioVendasLista() {
		this.venda=null;
		this.prox=null;
	}
	
	
	public void inserir(Venda venda) {
		
		
			if (existe(buscar(venda.getId()))) {
				
				
				
				if (this.venda.equals(null)) {
					this.venda=venda;
					this.prox=new RepositorioVendasLista();
				}else {
					this.prox.inserir(venda);
				}
				
				
				
				
			}else {
				//vai dar excecao
			}
		
		
		
	}

	
	public boolean existe(Venda venda) {
		boolean aux=false;
		if (!venda.equals(null)) {
			if (!this.venda.equals(null)) {
			if (this.prox.equals(null)) {
				//erro q nao existe
			}
				else if (this.venda.equals(venda)) {
					aux=true;
					
				}else {
					aux= prox.existe(venda);
				}
			}
			
		}else {
			//vai dar excecao porem o da venda ser null vai estar na camada de negocios

		}
		
		
		return aux;
		
		
	}

	
	public Venda buscar(int id) {

		Venda aux=null;
		if (prox.equals(null)) {
			//erro de nao encontrar nenhum Venda com o id
		}
		else if (venda.getId()==id) {
			aux= venda ;
		}else {
			aux= prox.buscar(id);
		}
		
		
		
		return aux;
	}


	
	public void atualizar(Venda vendaAntiga, Venda vendaAtualizada) {
		
		
			if (!venda.equals(null)) {
			if (this.prox.equals(null)) {
				//erro q nao existe
			}
				else if (this.venda.equals(vendaAntiga)) {
					
					this.venda=vendaAtualizada;
				}
				else {
					prox.existe(venda);
				}
			}
			
		else {
			//vai dar excecao porem o da venda ser null vai estar na camada de negocios

		}
		
		
	}

}
