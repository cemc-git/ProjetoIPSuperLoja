package ServicoDeEntrega;

public class FreteVazioException extends Exception {
	public FreteVazioException(ServicoDeEntrega frete) {
		super ("A venda fornecida está vazia!");
	}
}
