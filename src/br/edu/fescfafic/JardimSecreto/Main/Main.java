package br.edu.fescfafic.JardimSecreto.Main;

import java.time.LocalDate;
import java.time.LocalTime;

import br.edu.fescfafic.JardimSecreto.Model.Evento;

public class Main {
    public static void main(String[] args) {
        Evento evento1 = new Evento(
                10,
                "Girls Night",
                LocalDate.of(2003, 7, 7),
                LocalTime.of(21, 10),
                "Florianopolis",
                10,
                5
        );

        evento1.exibirInfo();
    }
}