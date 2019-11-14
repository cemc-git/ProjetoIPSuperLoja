package ServicoDeEntrega;

public class CadastroServicoDeEntrega {
private RepositorioServicoEntrega fretes;

public CadastroServicoDeEntrega(RepositorioServicoEntrega repositorioFretes) {
	fretes=repositorioFretes;
}
public void cadastrarFrete(ServicoDeEntrega frete) throws FreteJaExistenteException, FreteVazioException{
	if (!fretes.existeFrete(frete)) {
		fretes.inserirFrete(frete);
	}else {
		throw new FreteJaExistenteException(frete);
	}
}
}
