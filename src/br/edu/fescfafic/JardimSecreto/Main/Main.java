package br.edu.fescfafic.JardimSecreto.Main;

import br.edu.fescfafic.JardimSecreto.Model.Evento;
import br.edu.fescfafic.JardimSecreto.Model.Organizador;
import br.edu.fescfafic.JardimSecreto.Model.ReservaEspaco;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Evento evento = new Evento(
                1,
                "Code night",
                LocalDate.of(2023, 12, 22),
                LocalTime.of(22, 40),
                100);


        Organizador org = new Organizador(
                "Junior",
                "james@gmail.com");
        Organizador org1 = new Organizador(
                "Luke",
                "luke@gmail.com");

        ReservaEspaco reservaEspaco = new ReservaEspaco(1,
                 org, evento,
                LocalDate.of(2023, 9, 25),
                "Beach bar");

        org1.exibirInfo();
        evento.exibirInfo();
        reservaEspaco.exibirInfo();


    }

}