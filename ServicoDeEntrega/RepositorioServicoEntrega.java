package projetoLojaHeroi;

public interface RepositorioServicoEntrega {
void inserirFrete(ServicoDeEntrega frete);//THROWS FRETE VAZIO
boolean procurarFrete(ServicoDeEntrega frete);//THROWS FRETE NAO EXISTE
String listarFrete();//THROWS NAO EXISTEM FRETES
}
