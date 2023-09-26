package br.edu.fescfafic.JardimSecreto.Main;
import br.edu.fescfafic.JardimSecreto.Model.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Evento evento1 = new Evento(
                154,
                "Everton",
                "Cachaca e Rapariga",
                LocalDate.of(2023,5,15),
                LocalTime.of(16,15),
                "Cajazeiras-PB"
        );
        Evento evento2 = new Evento(
                155,
                "Kaue",
                "Despedida de Solteiro de Kokin",
                LocalDate.of(2023,5,19),
                LocalTime.of(18,30),
                "Cajazeiras-PB"
        );
        Evento evento3 = new Evento(
                156,
                "Junior",
                "Farra das Primas",
                LocalDate.of(2023,5,22),
                LocalTime.of(17,0),
                "Cajazeiras-PB"
        );
        //evento1.exibirInfo();

        Organizador organizadorEverton = new Organizador(
                "Everton Candido",
                1,
                "everton.ci@gmail.com"
        );
        Organizador organizadorKaue = new Organizador(
                "Kaue Batista",
                2,
                "kaue.saopaulo@gmail.com"
        );
        Organizador organizadorJunior = new Organizador(
                "Jose Ironildo",
                3,
                "junior.ji@gmail.com"
        );
        //organizadorEverton.exibirInfo();
        ReservaEspaco reservaEspaco = new ReservaEspaco(
                evento1,
                organizadorEverton
        );
        //reservaEspaco.exibirInfo();
        Calendario calendario = new Calendario();
        calendario.inserirEvento(organizadorEverton, evento1);
        //calendario.verificarDisponibilidade(evento1);
        calendario.exibirInfo();
        calendario.cancelarEvento(evento1);
        calendario.exibirInfo();
    }
}

