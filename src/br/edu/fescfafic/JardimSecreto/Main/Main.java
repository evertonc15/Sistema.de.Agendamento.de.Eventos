package br.edu.fescfafic.JardimSecreto.Main;

import br.edu.fescfafic.JardimSecreto.Model.Calendario;
import br.edu.fescfafic.JardimSecreto.Model.Evento;
import br.edu.fescfafic.JardimSecreto.Model.Organizador;
import br.edu.fescfafic.JardimSecreto.Model.ReservaEspaco;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Evento evento = new Evento(

                "Code night",
                LocalDate.of(2023, 12, 22),
                LocalTime.of(22, 40),"Auditorio da DIO",300);

        Evento evento1=new Evento("Hackthon",
                LocalDate.of(2023,12,2),
                LocalTime.of(10,45),"Auditorio Fafic",200);


        Organizador org = new Organizador(
                "Junior",
                "james@gmail.com");
        Organizador org1 = new Organizador(
                "Luke",
                "luke@gmail.com");

        ReservaEspaco reservaEspaco = new ReservaEspaco(evento,
                 org, evento,
                LocalDate.of(2023, 9, 25),
                evento);

//        org1.exibirInfo();
        Calendario cadastrar=new Calendario();
        cadastrar.inserirEvento(evento);
        cadastrar.inserirEvento(evento1);
        cadastrar.exibirInfo();



//        evento.exibirInfo();
//        reservaEspaco.exibirInfo();



    }

}