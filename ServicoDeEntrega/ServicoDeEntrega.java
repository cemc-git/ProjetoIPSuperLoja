package ServicoDeEntrega;
import Venda.Venda;

public class ServicoDeEntrega {
	private double distancia;
	private String tipoDeEntrega;
	private Venda venda;
	//private RepositorioEntregas ServiçoDeEntrega;
	
	public ServicoDeEntrega(double distanciaX,Venda venda,String tipoDeEntrega) {
		this.distancia=distanciaX;
		this.tipoDeEntrega=tipoDeEntrega;
		this.venda=venda;
	}

	public double getDistancia() {
		return distancia;
	}
	
	public Venda getVenda() {
		return venda;
	}
	public String getTipoDeEntrega() {
		return tipoDeEntrega;
	}
	
	public double calcularPrecoFrete(ServicoDeEntrega frete) throws DIException {//EXCEPTION DISTANCIA INVALIDA
		double calculo=0;
		if (this.distancia>0&&this.distancia<100) {
			calculo=Math.sqrt(Math.pow(this.distancia, 2));
		}
		else if (this.distancia>=100&&this.distancia<1000) {
			calculo=Math.sqrt(Math.pow(this.distancia, 2))*10;
		}else if (this.distancia>1000) {
			calculo=Math.sqrt(Math.pow(this.distancia, 2))*100;
		}else if (this.distancia<0) {
			DIException erro;
			erro=new DIException(this.distancia,frete);
			throw erro;
		}
		switch (this.tipoDeEntrega) {
		case "rapidex":
			calculo*=5;
			break;
		case "interplanetaria":
			calculo*=20;
			break;
		default:
			break;
		}
		return calculo;
	}	
}

