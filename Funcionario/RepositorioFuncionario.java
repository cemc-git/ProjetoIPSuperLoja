
public interface RepositorioFuncionario {
//São os Metodos da minha interface4
public void inserir(Funcionario funcionario)throws FuncionarioCadastradoException;
public void remover(String cpf);
public boolean procurar(String cpf);
public void atualizar(Funcionario funcionario);
//em lista funcionario é o tipo do atributo.
}
