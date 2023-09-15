package br.edu.fescfafic.JardimSecreto.Model;

public class Organizador {
   public String nome;
   public String id;
   public String email;
   public String [] eventosOrganizados = new String[4];

    public Organizador(String nome, String id, String email) {
        this.nome = nome;
        this.id  = id;
        this.email = email;
    }
    public void exibirInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println(("ID: " + this.id));
        System.out.println("E-mail: " + this.email);
        System.out.println("Eventos organizados: " + eventosOrganizados.length);
    };

}
