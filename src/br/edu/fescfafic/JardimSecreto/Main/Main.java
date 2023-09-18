package br.edu.fescfafic.JardimSecreto.Main;
import br.edu.fescfafic.JardimSecreto.Model.Calendario;
import br.edu.fescfafic.JardimSecreto.Model.Evento;
import br.edu.fescfafic.JardimSecreto.Model.Organizador;
import br.edu.fescfafic.JardimSecreto.Model.Organizador;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Evento evento = new Evento(
                154626,
                "Troca de cus",
                LocalDate.of(2023,5,25),
                LocalTime.of(17,20),
                "Cajazeiras"
        );
        //evento.exibirInfo();
        Organizador o1 = new Organizador(
                "Everton",
                17,
                "everton.ci@outlook.com"
        );
        o1.exibirInfo();

        Calendario calendario = new Calendario(2);
        calendario.inserirEvento(evento);
        calendario.verificarDisponibilidade(evento);
        System.out.println("+++++++++++++++++++++");
        calendario.cancelarEvento(evento);
        calendario.verificarDisponibilidade(evento);
    }
}
