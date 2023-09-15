package br.edu.fescfafic.JardimSecreto.Model;

public class Organizador {
   public String nome;
   public String id;
   public String email;
   public String [] eventosOrganizados = new String[4];

    public Organizador(String nome, String id, String email, String [] eventosOrganizados) {
        this.nome = nome;
        this.id  = id;
        this.email = email;
        this.eventosOrganizados = eventosOrganizados;
    }
    public void exibirInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println(("ID: " + this.id));
        System.out.println("E-mail: " + this.email);
    };

}
