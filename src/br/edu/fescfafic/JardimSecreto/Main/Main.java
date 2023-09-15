package br.edu.fescfafic.JardimSecreto.Main;

import br.edu.fescfafic.JardimSecreto.Model.Calendario;
import br.edu.fescfafic.JardimSecreto.Model.Evento;
import br.edu.fescfafic.JardimSecreto.Model.Organizador;
import br.edu.fescfafic.JardimSecreto.Model.ReservaEspaco;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Evento evento1 = new Evento(
                10,
                "Kaue Batista",
                "Girls Night",
                LocalDate.of(2003, 7, 7),
                LocalTime.of(21, 10),
                "Florianopolis",
                10,
                5
        );

        Evento evento2 = new Evento(
                11,
                "Kaue Batista",
                "Swing House",
                LocalDate.of(2003, 7, 7),
                LocalTime.of(21, 10),
                "Florianopolis",
                10,
                5
        );
        Evento evento3 = new Evento(
                11,
                "Kaue Batista",
                "Developers Night",
                LocalDate.of(2003, 7, 7),
                LocalTime.of(21, 10),
                "Florianopolis",
                10,
                5
        );
        Evento evento4 = new Evento(
                11,
                "Kaue Batista",
                "Gamers Night",
                LocalDate.of(2003, 7, 7),
                LocalTime.of(21, 10),
                "Florianopolis",
                10,
                5
        );

        Organizador organizador1 = new Organizador(
                "Kaue Batista",
                10,
                "kauebatista3@gmail.com"
        );

        Organizador organizador2 = new Organizador(
                "Jose",
                10,
                "kauebatista3@gmail.com"
        );


        ReservaEspaco reserva1 = new ReservaEspaco(
                organizador1,
                evento1
        );

        Calendario calendario = new Calendario();

//        reserva1.exibirInfo();
//        evento1.exibirInfo();
        organizador1.exibirInfo();
//        reserva1.exibirInfo();

        calendario.inserirEvento(evento1, organizador1);
        calendario.inserirEvento(evento2, organizador1);
        calendario.inserirEvento(evento3, organizador1);
        calendario.inserirEvento(evento4, organizador1);
        calendario.exibirEventos();




    }
}