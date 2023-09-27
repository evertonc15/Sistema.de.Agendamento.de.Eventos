package br.edu.fescfafic.JardimSecreto.Main;
import br.edu.fescfafic.JardimSecreto.Model.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main{
    public static void main(String[] args){
        Evento evento1 = new Evento(
                10,
                "Drink House",
                LocalDate.of(2023,05,17),
                LocalTime.of(15,30),
                "Cajazeiras"
        );
        evento1.exibirInfo();
        Organizador organizadorKaue = new Organizador(
          "Kaue",
          10,
          "kaue@gmail.com"
        );
        organizadorKaue.exibirInfo();
        ReservaEspaco time = new ReservaEspaco(
                organizadorKaue,
                evento1
        );
       time.exibirInfo();
       Calendario calendario1 = new Calendario();
       calendario1.inserirEvento(evento1, organizadorKaue);
       calendario1.cancelarEvento(organizadorKaue, 10);
//       calendario1.inserirEvento(evento1, organizadorKaue);
        calendario1.exibirEventos();
    }
}