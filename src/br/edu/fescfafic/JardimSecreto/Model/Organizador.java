package br.edu.fescfafic.JardimSecreto.Model;

import java.time.temporal.Temporal;

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
        System.out.printf("\nNome - %s", nomedoOrganizador);
        System.out.printf("\nID - %d", id);
        System.out.printf("\nEmail - %s", email);
    }
}
