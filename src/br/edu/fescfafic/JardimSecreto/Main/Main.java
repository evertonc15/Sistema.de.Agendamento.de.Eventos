package br.edu.fescfafic.JardimSecreto.Main;
import br.edu.fescfafic.JardimSecreto.Model.Evento;
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
        evento.exibirInfo();
    }
}
