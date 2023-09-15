package br.edu.fescfafic.JardimSecreto.Model;

import java.time.LocalDate;
import java.util.Random;


public class ReservaEspaco {
    public int idReserva;
    public Organizador organizador;
    public Evento evento;
    public LocalDate dataReserva;
    public String espacoReservado;

    //Construtor


    public ReservaEspaco(int idReserva, Organizador organizador,
                         Evento evento,
                         LocalDate dataReserva,
                         String espacoReservado) {

        this.idReserva = idReserva;
        this.organizador = organizador;
        this.evento = evento;
        this.dataReserva = dataReserva;
        this.espacoReservado = espacoReservado;
    }

    //Metodos
    public void exibirInfo() {
        Random rd = new Random();
        int idRes = rd.nextInt(500);
        this.idReserva = idRes;
        System.out.println("== DADOS DO ESPAÇO RESERVADO ==");
        System.out.println("-".repeat(30));
        System.out.printf("Código da reserva: %d %n", this.idReserva);
        System.out.printf("Organizador responsável: %s %n", this.organizador.nome);
        System.out.printf("Evento: %s %n", this.evento.nomeEvento);
        System.out.printf("Data da reserva: %s %n", this.dataReserva.toString());
        System.out.printf("Local do evento: %s %n", this.espacoReservado);
        System.out.println("=".repeat(30));
    }

}
