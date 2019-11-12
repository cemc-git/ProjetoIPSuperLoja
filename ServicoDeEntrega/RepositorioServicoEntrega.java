package projeto;

public interface RepositorioServicoEntrega {
void inserirFrete(ServicoDeEntrega frete) throws FreteVazioException,FreteJaExistenteException;//THROWS FRETE VAZIO & FRETE JA EXISTE
boolean existeFrete(ServicoDeEntrega frete);
void removerFrete(ServicoDeEntrega frete) throws FreteInexistenteException;
ServicoDeEntrega procurarFrete(ServicoDeEntrega frete)throws FreteInexistenteException;
void atualizarFrete (ServicoDeEntrega frete,ServicoDeEntrega newFrete)throws FreteInexistenteException;
}
