package br.edu.fescfafic.JardimSecreto.Model;

import java.time.LocalDate;

public class ReservaEspaco {
    public Organizador nome;
    public Evento nomeDoEvento;
    public Evento idDoevento;
    public LocalDate dataDaReserva;
    public Evento localDoEvento;

    public ReservaEspaco(Organizador nome, Evento nomeDoEvento, Evento idDoevento, LocalDate dataDaReserva, Evento localDoEvento) {
        this.nome = nome;
        this.nomeDoEvento = nomeDoEvento;
        this.idDoevento = idDoevento;
        this.dataDaReserva = dataDaReserva;
        this.localDoEvento = localDoEvento;
    }
    public void exibirInfo(){
        System.out.println("_____________AGENDAMENTO_______________");
        System.out.println("Nome do Organizador: " + this.nome.nome);
        System.out.println("Nome do Evento: " + this.nomeDoEvento.nomeDoEvento);
        System.out.println("ID do Evento: " + this.idDoevento.idDoEvento);
        System.out.println("Data da Reserva: " + this.dataDaReserva);
        System.out.println("Espaço Reservado: " + this.localDoEvento.localDoEvento);
        System.out.println("_________________________________________");

    }
}

