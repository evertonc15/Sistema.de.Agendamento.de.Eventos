package br.edu.fescfafic.JardimSecreto.Model;

public class Organizador {
    public String nome;
    public int id;
    public String email;
    public Evento[] eventosOrganizados;
    public static final int NUM_EVENTOS = 10;
    public Organizador(String nome, int id, String email){
        this.nome = nome;
        this.id = id;
        this.email = email;
        this.eventosOrganizados = new Evento[NUM_EVENTOS];
    }
    public void exibirInfo() {
        System.out.printf("Nome do Organizador: %s", this.nome);
        System.out.printf("\nID do Organizador: %d", this.id);
        System.out.printf("\nEmail: %s", this.email);
    }
    /*public void adicionarEvento(Evento evento) {
        boolean adicionar = false;
        for (int i = 0; i < eventosOrganizados.length; i++) {
            if (eventosOrganizados[i] == null) {
                this.eventosOrganizados[i] = evento;
                adicionar = true;
            }
        }
        if (adicionar){
                System.out.println("\nEvento adicionado com sucesso");
            }
        else {
                System.out.println("Organizador ja alcancou o limite de eventos permitidos");
            }
    }*/
}

