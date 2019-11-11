package ServicoDeEntrega;

public interface RepositorioServicoEntrega {
void inserirFrete(ServicoDeEntrega frete) throws FreteVazioException,FreteJaExistenteException;//THROWS FRETE VAZIO & FRETE JA EXISTE
boolean procurarFrete(ServicoDeEntrega frete) throws FreteInexistenteException;//THROWS FRETE NAO EXISTE
String listarFrete() throws ListaDeFretesVaziaException;//THROWS NAO EXISTEM FRETES
}
