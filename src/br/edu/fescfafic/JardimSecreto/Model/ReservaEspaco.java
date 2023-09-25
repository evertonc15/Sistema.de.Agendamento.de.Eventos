package br.edu.fescfafic.JardimSecreto.Model;
import java.time.LocalDate;
public class ReservaEspaco  {
    public Organizador organizador;
    public Evento evento;
    public LocalDate dataReserva;
    public String espacoReservado;
    public ReservaEspaco(Organizador organizador, Evento evento){
        this.organizador = organizador;
        this.evento = evento;
        this.dataReserva = evento.dataDoEvento;
        this.espacoReservado = evento.localDoEvento;
    }
    public void exibirInfo(){
        System.out.printf("\nOrganizador do Evento: %s",this.organizador.nome);
        System.out.printf("\nEvento Reservado: %s", evento.nomeDoEvento);
        System.out.printf("\nData da reserva: %s", this.dataReserva);
        System.out.printf("\nLocal do Evento: %s", this.espacoReservado);
    }
}
