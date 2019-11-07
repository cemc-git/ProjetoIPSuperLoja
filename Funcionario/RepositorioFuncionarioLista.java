
public class RepositorioFuncionarioLista implements RepositorioFuncionario {
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
	public boolean procurar(String cpf) {

		return false;
	}

	@Override
	public void atualizar(Funcionario funcionario) {

	}

}
