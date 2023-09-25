package br.edu.fescfafic.JardimSecreto.Main;
import br.edu.fescfafic.JardimSecreto.Model.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Evento evento1 = new Evento(
                154626,
                "Junior",
                "Cabare House",
                LocalDate.of(2023,5,25),
                LocalTime.of(17,20),
                "Cajazeiras"
        );
        Evento evento2 = new Evento(
                4564525,
                "Everton",
                "Drink Fest",
                LocalDate.of(2023,5,28),
                LocalTime.of(17,30),
                "Cachoeira dos Indios"
        );
        Evento evento3 = new Evento(
                1556487,
                "Lucas",
                "Balada Boa",
                LocalDate.of(2023,7,12),
                LocalTime.of(18,30),
                "Cajazeiras"
        );
        Evento evento4 = new Evento(
                154546587,
                "Kaue",
                "Festa do primeiro titulo",
                LocalDate.of(2023,7,15),
                LocalTime.of(18,5),
                "Carrapateira"
        );
        Evento evento5 = new Evento(
                45156454,
                "Kokin",
                "Festa Neon",
                LocalDate.of(2023,7,18),
                LocalTime.of(17,15),
                "Carrapateira"
        );
        Organizador organizador1 = new Organizador(
                "Everton",
                17,
                "everton.ci@outlook.com"
        );
        Organizador organizador2 = new Organizador(
                "Kaue",
                10,
                "kaue.1copa@gmail.com"
        );
        Organizador organizador3 = new Organizador(
                "Lucas",
                19,
                "lucas.luke@gmail.com"
        );
        Organizador organizador4 = new Organizador(
                "Junior",
                18,
                "junior.cz@gmail.com"
        );
        Organizador organizador5 = new Organizador(
                "Kokin",
                12,
                "kokindelas@gmail.com"
        );

        ReservaEspaco reserva = new ReservaEspaco(
                organizador1,
                evento1
        );

        Calendario calendario = new Calendario();
        Organizador organizadorSelecionado = null;
        Scanner teclado = new Scanner(System.in);
        int escolherOrganizador;
        int escolherMenu;
        boolean abriMenu = true;

        while(abriMenu){
            System.out.println("\nEscolha o organizador\n1-Everton,\n2-kaue\n3-Lucas,\n4-Junior,\n5-kokin");
            escolherOrganizador = teclado.nextInt();
            switch (escolherOrganizador) {
                case 1 -> organizadorSelecionado = organizador1;
                case 2 -> organizadorSelecionado = organizador2;
                case 3 -> organizadorSelecionado = organizador3;
                case 4 -> organizadorSelecionado = organizador4;
                case 5 -> organizadorSelecionado = organizador5;
                default -> System.out.println("Organizador selecionado nao existe!");
            }
            if (organizadorSelecionado != null){
                organizadorSelecionado.exibirInfo();
                System.out.println("Menu:\n1-Exibir Eventos Agendados\n2-Exibir Eventos Agendados pelo o organizador");
                escolherMenu = teclado.nextInt();
                switch (escolherMenu){
                    case 1 -> calendario.listarEventosAgendados();
                    case 2 -> organizadorSelecionado.exibirInfo();
                }
            }
        }
    }
}
