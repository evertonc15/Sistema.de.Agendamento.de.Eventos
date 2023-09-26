package br.edu.fescfafic.JardimSecreto.Model;

import java.time.LocalDate;

public class ReservaEspaco {
    public String nomeDoOrganizador;
    public String nomeDoEvento;
    public LocalDate dataDaReserva;
    public String localReservado;

    public ReservaEspaco(Organizador organizador, Evento evento) {
        this.nomeDoOrganizador = organizador.nomedoOrganizador;
        this.nomeDoEvento = evento.nomeDoEvento;
        this.dataDaReserva = evento.dataDoEvento;
        this.localReservado = evento.localDoEvento;
    }

    public void exibirInfo(){
        System.out.printf("\nNome do Organizador - %s", nomeDoOrganizador);
        System.out.printf("\nNome do Evento - %s", nomeDoEvento);
        System.out.printf("\nData - %s", dataDaReserva);
        System.out.printf("\nLocal - %s", localReservado);
    }
}