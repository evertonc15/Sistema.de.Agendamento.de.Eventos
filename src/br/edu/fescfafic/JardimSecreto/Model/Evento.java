package br.edu.fescfafic.JardimSecreto.Model;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Evento {
    public int idDoEvento;
    public String nomeDoEvento;
    public LocalDate dataDoEvento;
    public LocalTime horaDoEvento;
    public String localDoEvento;
    public int[] capacidadeDeParticipantes;
    public int participantesRegistrados;
    public Evento(int id, String nomeDoEvento, LocalDate data, LocalTime hora, String local){
        this.idDoEvento = id;
        this.nomeDoEvento = nomeDoEvento;
        this.dataDoEvento = data;
        this.horaDoEvento = hora;
        this.localDoEvento = local;
        this.capacidadeDeParticipantes = new int[participantesRegistrados];
    }
    public void exibirInfo(){
        System.out.printf("ID: %s", this.idDoEvento);
        System.out.printf("\nNome do Evento: %s", this.nomeDoEvento);
        System.out.printf("\nData: %s", this.dataDoEvento);
        System.out.printf("\nHora: %s", this.horaDoEvento);
        System.out.printf("\nLocal: %s", this.localDoEvento);
        System.out.printf("\nTotal de partipantes: %s", this.participantesRegistrados);
    }
}
