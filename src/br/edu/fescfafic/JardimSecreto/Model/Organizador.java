package br.edu.fescfafic.JardimSecreto.Model;

public class Organizador {
    public String nomeDoOrganizador;
    public int idDoOrganizador;
    public String email;
    public Evento[] eventosOrganizados = new Evento[3];
    public int quantidadeDeEventosOrganizados = 0;
    public Organizador(String nome, int id, String email){
        this.nomeDoOrganizador = nome;
        this.idDoOrganizador = id;
        this.email = email;
    }
    public void exibirInfo(){
        System.out.println("__________ Dados Do Organizador __________");
        System.out.printf("Nome do Organizador: %s", this.nomeDoOrganizador);
        System.out.printf("\nId do Organizador: %s", this.idDoOrganizador);
        System.out.printf("\nEmail do Organizador: %s", this.email);
        System.out.println("\n__________________________________________");
    }
}
