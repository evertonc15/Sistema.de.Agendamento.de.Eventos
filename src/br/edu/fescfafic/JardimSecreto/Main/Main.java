package br.edu.fescfafic.JardimSecreto.Main;

import br.edu.fescfafic.JardimSecreto.Model.Evento;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Evento casamentoDoKokin = new Evento(001, "Enlace Matrimonial: Quenga & Kokin",
                LocalDate.of(2024,02,29), LocalTime.of(12,00),
                "Bar Caneco Amassado");

        casamentoDoKokin.exibirInfo();

    }
}