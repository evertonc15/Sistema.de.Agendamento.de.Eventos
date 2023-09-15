package br.edu.fescfafic.JardimSecreto.Model;
import java.time.LocalDate;
public class ReservaEspaco  {
    public Organizador organizador;
    public Evento evento;
    public LocalDate dataReserva;
    public String espacoReservado;
    public ReservaEspaco(Organizador organizador, Evento evento, LocalDate dataReserva, String espacoReservado){
        this.organizador = organizador;
        this.evento = evento;
        this.dataReserva = dataReserva;
        this.espacoReservado = espacoReservado;
    }
    public void exibirInfo(){
        System.out.printf("Organizador do Evento: %s",this.organizador);
        System.out.printf("Evento Reservado: %s", evento.nomeDoEvento);
        System.out.printf("\nData da reserva: %s", this.dataReserva);
        System.out.printf("\nLocal do Evento: %s", this.espacoReservado);

    }
}
