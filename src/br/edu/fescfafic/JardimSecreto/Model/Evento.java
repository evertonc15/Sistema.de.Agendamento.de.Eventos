package br.edu.fescfafic.JardimSecreto.Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Evento {
    public int idDoEvento;
    public String nomeDoEvento;
    public LocalDate dataDoEvento;
    public LocalTime horaDoEvento;
    public String localDoEvento;
    public int capacidadeTotalDoEvento = 10;
    public int participantesRegistrados;

    public Evento(int idDoEvento, String nomeDoEvento, LocalDate dataDoEvento, LocalTime horaDoEvento, String localDoEvento, int capacidadeTotalDoEvento, int participantesRegistrados){
        this.idDoEvento = idDoEvento;
        this.nomeDoEvento = nomeDoEvento;
        this.dataDoEvento = dataDoEvento;
        this.horaDoEvento = horaDoEvento;
        this.localDoEvento = localDoEvento;
        this.capacidadeTotalDoEvento = capacidadeTotalDoEvento;
        this.participantesRegistrados = participantesRegistrados;
    }

    public void exibirInfo(){
        System.out.printf("\nNome do Evento %s", nomeDoEvento);
        System.out.printf("\nData do Evento %s", dataDoEvento);
        System.out.printf("\nHora do Evento %s", horaDoEvento);
        System.out.printf("\nLocal do Evento %s", localDoEvento);
        System.out.printf("\nCapacidade do Evento %s", capacidadeTotalDoEvento);
    }
}
