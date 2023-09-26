package br.edu.fescfafic.JardimSecreto.Model;

import java.time.LocalDate;

public class ReservaEspaco {
    public String evento;
    public String organizador;
    public LocalDate data;
    public String localDoEvento;
    public ReservaEspaco(Evento evento, Organizador organizador){
        this.evento = evento.nomeDoEvento;
        this.organizador = organizador.nomeDoOrganizador;
        this.data = evento.dataDoEvento;
        this.localDoEvento = evento.localDoEvento;
    }
    public void exibirInfo(){
        System.out.println("__________ Espaco Reservado __________");
        System.out.printf("Nome do Evento: %s", this.evento);
        System.out.printf("\nOrganizador do Evento: %s", this.organizador);
        System.out.printf("\nData do Evento: %s", this.data);
        System.out.printf("\nLocal do Evento: %s", this.localDoEvento);
        System.out.println("\n______________________________________");
    }
}
