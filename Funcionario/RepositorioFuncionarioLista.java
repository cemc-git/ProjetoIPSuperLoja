
public class RepositorioFuncionarioLista implements RepositorioFuncionario{
	
	private Funcionario funcionario;
	private RepositorioFuncionarioLista proximo;

	public RepositorioFuncionarioLista() {
		this.funcionario = null;
		this.proximo = null;
	}

	@Override
	public void inserir(Funcionario funcionario) throws FuncionarioCadastradoException{
		if (this.funcionario.equals(null)) {
			this.funcionario = funcionario;
			this.proximo = new RepositorioFuncionarioLista();
		}else if(this.funcionario.equals(funcionario)) {
		throw new FuncionarioCadastradoException();	
		}
		else {
			this.proximo.inserir(funcionario);
		}

	}

	@Override
	//demetir e igual a remover
	public void remover(String cpf) throws FuncionarioNaoExisteException {
	if(this.funcionario.getCpf() !=null) {
	  if(this.funcionario.getCpf().equals(cpf)) {
	 this.funcionario=this.proximo.funcionario;
	 this.proximo=this.proximo.proximo;	    
	}else {
	 this.proximo.remover(cpf);	
	}	
	}else {
	throw new	FuncionarioNaoExisteException();
	}
	}

	@Override
	public void procurar(String cpf) throws FuncionarioNaoExisteException {
		if (this.getCpf != null) {
			if (this.getCpf.equals(cpf)) {
				return this.funcionario;
			} else {
				return this.proximo.procurar(cpf);
			}
		} else {
			throw new FuncionarioNaoExisteException();
		}
	}

	@Override
	public void atualizar(String cpf, Funcionario funcionario)throws FuncionarioNaoExisteException {
	if(this.getCpf != null) {
	  if(this.getCpf.equals(cpf)) {
		this.funcionario=funcionario; 
	  }else {
		this.proximo.atualizar(cpf, funcionario);  
	  }
	}else {
	throw new FuncionarioNaoExisteException();
	}

	}
	public boolean existe(String cpf) {
	if(this.getCpf != null) {
	if(this.getCpf.equals(cpf)) {
	  return true;	
	}else {
	return this.proximo.existe(cpf);	
	}
	}else {
	return false;	
	}
	}

}