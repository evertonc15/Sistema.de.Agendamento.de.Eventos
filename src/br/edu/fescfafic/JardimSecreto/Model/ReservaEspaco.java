package br.edu.fescfafic.JardimSecreto.Model;

import java.time.LocalDate;

public class ReservaEspaco {
    public Evento idReserva;
    public Organizador organizador;
    public Evento evento;
    public LocalDate dataReserva;
    public Evento espacoReservado;

    //Construtor

    public ReservaEspaco(Evento idReserva, Organizador organizador,
                         Evento evento,
                         LocalDate dataReserva,
                         Evento espacoReservado) {

        this.idReserva = idReserva;
        this.organizador = organizador;
        this.evento = evento;
        this.dataReserva = dataReserva;
        this.espacoReservado = espacoReservado;
    }

    //Metodos
    public void exibirInfo() {

        System.out.println("== DADOS DO ESPAÇO RESERVADO ==");
        System.out.println("-".repeat(30));
        System.out.printf("Código da reserva: %d %n", this.idReserva.idEvento);
        System.out.printf("Organizador responsável: %s %n", this.organizador.nome);
        System.out.printf("Evento: %s %n", this.evento.nomeEvento.toUpperCase());
        System.out.printf("Data da reserva: %s %n", this.dataReserva);
        System.out.printf("Espaço: %s %n", this.espacoReservado.localEvento);
        System.out.println("=".repeat(30));
    }

}
