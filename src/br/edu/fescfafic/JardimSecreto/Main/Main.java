package br.edu.fescfafic.JardimSecreto.Main;

import br.edu.fescfafic.JardimSecreto.Model.Evento;
import br.edu.fescfafic.JardimSecreto.Model.Organizador;
import br.edu.fescfafic.JardimSecreto.Model.ReservaEspaco;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        Evento casamentoDoKokin = new Evento(001, "Enlace Matrimonial: Quenga & Kokin",
                LocalDate.of(2024,02,29), LocalTime.of(12,00),
                "Bar Caneco Amassado");

        System.out.println("__________________INFORMAÇÕES DO EVENTO______________");
        casamentoDoKokin.exibirInfo();

        Organizador kaue = new Organizador("Kaue Cabelinho",
                "24", "kaue@cabelinhoeventos.com");

        System.out.println("_____________INFORMAÇÕES DO ORGANIZADOR_______________");
        kaue.exibirInfo();

    }
}