package Projeto.Cliente;
public interface RepositorioCliente {
    public void inserir(Cliente cliente);
    public Cliente buscar(String nome, String cpf);
    public boolean existe(String nome, String cpf);
    public void atualizar(Cliente cliente, Cliente clienteNovo);
    
}
