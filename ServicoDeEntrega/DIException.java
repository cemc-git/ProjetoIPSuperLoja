package projetoLojaHeroi;

public class DIException extends Exception{
	private double distancia;
	private ServicoDeEntrega frete;
	
	public DIException(double distancia,ServicoDeEntrega frete) {
		super ("Distância fornecida é inválida!");
		this.distancia=distancia;
		this.frete=frete;	
	}
	public double getDistancia() {
		return distancia;
	}
}
