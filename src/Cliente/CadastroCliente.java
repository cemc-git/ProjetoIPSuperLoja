package Cliente;

public class CadastroCliente {
	private RepositorioCliente Cadastro;
    private Cliente cliente;
	public void cadastrar(Cliente cliente) throws ClienteExisteException,CamposInvalidoException{
    	 if(Cadastro.existe(cliente.getNome(),cliente.getCpf())) {
    		  ClienteExisteException erro = new ClienteExisteException(cliente.getNome(),cliente.getCpf());
    	 }
    	 else if(cliente.getNome().equals("")|| cliente.getCpf().length()!=11) {
    		 CamposInvalidoException erro = new CamposInvalidoException();
    	 }
    	 
    	 
     }
     
}
