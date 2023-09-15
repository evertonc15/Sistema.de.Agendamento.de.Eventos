package br.edu.fescfafic.JardimSecreto.Main;

import br.edu.fescfafic.JardimSecreto.Model.Calendario;
import br.edu.fescfafic.JardimSecreto.Model.Evento;
import br.edu.fescfafic.JardimSecreto.Model.Organizador;
import br.edu.fescfafic.JardimSecreto.Model.ReservaEspaco;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        // Eventos
        Evento casamentoDoKokin = new Evento(001, "Enlace Matrimonial: Quenga & Kokin",
                LocalDate.of(2024,02,29), LocalTime.of(12,00),
                "Bar Caneco Amassado",
                400);

        Evento despedidaDeSolteiro = new Evento (002, "Despedida de Soleiro do Kokin",
                LocalDate.of(2023,12,5), LocalTime.of(21,00),
                "Boate Flor da Noite",
                20);

        System.out.println("__________________EVENTOS____________________");
        casamentoDoKokin.exibirInfo();
        System.out.println("_____________________________________________");
        despedidaDeSolteiro.exibirInfo();

        // Organizadores
        Organizador kaue = new Organizador("Kaue Cabelinho",
                "24", "kaue@cabelinhoeventos.com");

        Organizador everton = new Organizador("Everton",
                "69", "everton@flordanoite.com");

        System.out.println("_____________ORGANIZADORES_______________");
        kaue.exibirInfo();
        System.out.println("_________________________________________");
        everton.exibirInfo();

//      Reservas
        ReservaEspaco reserva1 = new ReservaEspaco(kaue, casamentoDoKokin,casamentoDoKokin, LocalDate.of(2023,11,2),casamentoDoKokin );
        ReservaEspaco reserva2 = new ReservaEspaco(everton, despedidaDeSolteiro, despedidaDeSolteiro, LocalDate.of(2023,11,4), despedidaDeSolteiro);

        System.out.println("_____________AGENDAMENTOS_______________");
        reserva1.exibirInfo();
        System.out.println("_________________________________________");
        reserva2.exibirInfo();



    }
}