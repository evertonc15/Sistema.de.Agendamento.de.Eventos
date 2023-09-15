package br.edu.fescfafic.JardimSecreto.Model;

import java.util.List;
import java.util.Random;

public class Organizador {
    public int idOrg;
    public String nome;
    public String email;
    public List<Evento> eventosOrganizados;

    //Construtor


    public Organizador(String nome, String email) {
        Random id = new Random();
        //Id automático com base na quantidade estabelecida de participantes.
        this.idOrg = id.nextInt(20);
        this.nome = nome;
        this.email = email;


    }

    public void exibirInfo() {
        System.out.println(" == DADOS GERAIS DO ORGANIZADOR ==");
        System.out.printf("Código: %d %n", this.idOrg);
        System.out.printf("Organizador(a): %s%n", this.nome);
        System.out.printf("E-mail: %s%n", this.email);
        System.out.println("--".repeat(15));

    }
}
