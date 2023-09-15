package br.edu.fescfafic.JardimSecreto.Model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Evento {
    public int idEvento;
    public String nomeEvento;
    public LocalDate dataEvento;
    public LocalTime horaEvento;

    public int capacidadeParticipantes;
    public int[] capacidadePessoas = new int[100];

    //Construtor


    public Evento(int idEvento,
                  String nomeEvento,
                  LocalDate dataEvento,
                  LocalTime horaEvento,

                  int capacidadeParticipantes) {

        this.idEvento = idEvento;
        this.nomeEvento = nomeEvento;
        this.dataEvento = dataEvento;
        this.horaEvento = horaEvento;

        this.capacidadeParticipantes = capacidadeParticipantes;

    }

    public void exibirInfo() {
        System.out.println(" == DADOS GERAIS DO EVENTO ==");
        System.out.println("--".repeat(15));
        System.out.printf("Código: %d %n", this.idEvento);
        System.out.printf("Evento: %s %n", this.nomeEvento.toUpperCase());
        System.out.printf("Data: %s %n", this.dataEvento);
        System.out.printf("Hora: %s %n", this.horaEvento);
        System.out.printf("Capacidade: %d pessoas.%n", this.capacidadePessoas.length);
        System.out.println("==".repeat(15));

    }
}
