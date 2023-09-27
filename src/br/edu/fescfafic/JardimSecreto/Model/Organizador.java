package br.edu.fescfafic.JardimSecreto.Model;

public class Organizador {
    public String nomedoOrganizador;
    public int id;
    public String email;
    public Evento[] eventosOrganizados = new Evento[3];
    public int quantidadDeEventosDoOrganizador = 0;

    public Organizador(String nomedoOrganizador, int id, String email) {
        this.nomedoOrganizador = nomedoOrganizador;
        this.id = id;
        this.email = email;
    }

    public void exibirInfo(){
        System.out.println("=".repeat(40));
        System.out.printf("Nome - %s", nomedoOrganizador);
        System.out.printf("\nID - %d", id);
        System.out.printf("\nEmail - %s\n", email);
        System.out.println("=".repeat(40));
    }
}
