package Projeto.Pessoa;
import Projeto.Venda.RepositorioVendas;
public abstract class Pessoa {
private String nome;
private String cpf;
private RepositorioVendas historico;

public Pessoa(String nome, String cpf, RepositorioVendas historico) {
this.nome=null;
this.cpf= null;
historico=null;
}



public String getNome() {
return nome;
}

public RepositorioVendas getHistorico() {
return historico;
}

public void setNome(String nome) {
this.nome = nome;
}

public String getCpf() {
return cpf;
}

public void setCpf(String cpf) {
this.cpf = cpf;
}
public void Bonus(Pessoa pessoa) {
	
}
}
