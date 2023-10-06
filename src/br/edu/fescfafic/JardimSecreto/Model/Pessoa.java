package br.edu.fescfafic.JardimSecreto.Model;

public abstract class Pessoa {

    public String nomeDoOrganizador;
    public int idDoOrganizador;
    public String email;

    public Pessoa(String nomeDoOrganizador, int idDoOrganizador, String email) {
        this.nomeDoOrganizador = nomeDoOrganizador;
        this.idDoOrganizador = idDoOrganizador;
        this.email = email;
    }

    public abstract void exibirInfo();
}
