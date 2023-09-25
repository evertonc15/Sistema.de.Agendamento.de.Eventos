package br.edu.fescfafic.JardimSecreto.Model;

public class Organizador {
    public String nome;
    public int id;
    public String email;
    public Evento[] eventosOrganizados = new Evento[3];
    public int quantidadeDeEventosOrganizados = 10;
    public Organizador(String nome, int id, String email){
        this.nome = nome;
        this.id = id;
        this.email = email;
    }
    public void exibirInfo() {
        System.out.printf("Nome do Organizador: %s", this.nome);
        System.out.printf("\nID do Organizador: %d", this.id);
        System.out.printf("\nEmail: %s", this.email);
    }
}

