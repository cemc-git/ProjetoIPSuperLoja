package Projeto.Cliente;

public class ClienteNExiste extends Exception {
       private String nome;
       private String cpf;
       
       public ClienteNExiste(String nome, String cpf) {
    	   super("Cliente n�o cadastrado");
    	   
       }
	
}
