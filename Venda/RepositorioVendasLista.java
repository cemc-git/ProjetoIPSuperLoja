package Venda;

public class RepositorioVendasLista implements RepositorioVendas {
private Venda venda;
private RepositorioVendasLista prox;
	
	public RepositorioVendasLista() {
		this.venda=null;
		this.prox=null;
	}
	
	
	public void inserir(Venda venda) throws InserirExistenteException {
		
		
			if (existe(venda)) {
				
				InserirExistenteException e = new InserirExistenteException(venda);
				
				
				
				
				
				
			}else {
				if (this.venda.equals(null)) {
					this.venda=venda;
					this.prox=new RepositorioVendasLista();
				}else {
					this.prox.inserir(venda);
				}
			}
		
		
		
	}

	
	public boolean existe(Venda venda) {
		boolean aux=false;
		if (!venda.equals(null)) {
			if (!this.venda.equals(null)) {
			if (this.prox.equals(null)) {
				//aux continua falso
			}
				else if (this.venda.equals(venda)) {
					aux=true;
					
				}else {
					aux= prox.existe(venda);
				}
			}
			
		}/*else {
			//vai dar excecao porem o da venda ser null vai estar na camada de negocios

		}*/
		
		
		return aux;
		
		
	}

	
	public Venda buscar(int id) throws BuscaIdException{

		Venda aux=null;
		if (prox.equals(null)) {
			
			BuscaIdException e=new BuscaIdException(id);
			throw e;
		}
		else if (venda.getId()==id) {
			aux= venda ;
		}else {
			aux= prox.buscar(id);
		}
		
		
		
		return aux;
	}


	
	public void atualizar(Venda vendaAntiga, Venda vendaAtualizada)throws VendaNaoEncontradaException {
		
		
			if (!venda.equals(null)) {
			if (this.prox.equals(null)) {
				VendaNaoEncontradaException e= new VendaNaoEncontradaException(vendaAntiga);
				throw e;
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


	@Override
	public void remover(Venda venda) throws VendaNaoEncontradaException {
	if (this.prox.equals(null)) {
		VendaNaoEncontradaException e = new VendaNaoEncontradaException(venda);
		throw e;
	}
		else if (this.venda.equals(venda)) {
			this.venda=this.prox.venda;
			this.prox=this.prox.prox;
		}else {
			prox.remover(venda);
		}
		
	}

}
