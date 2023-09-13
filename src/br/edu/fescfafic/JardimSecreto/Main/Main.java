package br.edu.fescfafic.JardimSecreto.Main;

import br.edu.fescfafic.JardimSecreto.Model.Evento;
import br.edu.fescfafic.JardimSecreto.Model.Organizador;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
//        Evento evento=new Evento(1,"Code night",
//                LocalDate.of(2023,12,22),
//                LocalTime.of(22, 40),20);

        Organizador org=new Organizador("Junior","james@gmail.com");
        Organizador org1=new Organizador("Luke","luke@gmail.com");
        org.exibirInfo();
        org1.exibirInfo();

    }

}