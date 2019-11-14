package Pessoa;
import Venda.RepositorioVendas;
public abstract class Pessoa {
private String nome;
private String cpf;
/*private RepositorioVendas historico;*/
private int bonus;

public Pessoa(String nome, String cpf, int bonus) {
this.nome=null;
this.cpf= null;
//this.historico=null;//
this.bonus = 0;
}



public String getNome() {
return nome;
}

/*public RepositorioVendas getHistorico() {
return historico;
}*/

public void setNome(String nome) {
this.nome = nome;
}

public String getCpf() {
return cpf;
}

public void setCpf(String cpf) {
this.cpf = cpf;
}
public void GerarBonus(Pessoa pessoa) {
	//this.bonus++;
     if(bonus > 3) {
    	 
    	 //ganha desconto na OLX
     }
        			 
}



public int getBonus() {
	return bonus;
}



public void setBonus(int bonus) {
	this.bonus = bonus;
}
}
