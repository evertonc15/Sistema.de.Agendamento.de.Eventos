package br.edu.fescfafic.JardimSecreto.Model;
import java.time.LocalDate;
import java.time.LocalTime;

public class Evento {
    public int idDoEvento;
    public String organizadorDoEvento;
    public String nomeDoEvento;
    public LocalDate dataDoEvento;
    public LocalTime horaDoEvento;
    public String localDoEvento;

    public Evento(int id, String orgDoEvento,String nome, LocalDate data, LocalTime hora, String local){
        this.idDoEvento = id;
        this.organizadorDoEvento = orgDoEvento;
        this.nomeDoEvento = nome;
        this.dataDoEvento = data;
        this.horaDoEvento = hora;
        this.localDoEvento = local;
    }
    public void exibirInfo(){
        System.out.println("__________ Dados do Evento __________");
        System.out.printf("ID: %d", this.idDoEvento);
        System.out.printf("\nOrganizador: %s", this.organizadorDoEvento);
        System.out.printf("\nNome do Evento: %s", this.nomeDoEvento);
        System.out.printf("\nData do Evento: %s", this.dataDoEvento);
        System.out.printf("\nHora do Evento: %s", this.horaDoEvento);
        System.out.printf("\nLocal do Evento: %s", this.localDoEvento);
        System.out.println("\n_____________________________________");
    }
}
