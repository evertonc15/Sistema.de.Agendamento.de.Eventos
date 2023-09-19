package br.edu.fescfafic.JardimSecreto.Main;

import br.edu.fescfafic.JardimSecreto.Model.Calendario;
import br.edu.fescfafic.JardimSecreto.Model.Evento;
import br.edu.fescfafic.JardimSecreto.Model.Organizador;
import br.edu.fescfafic.JardimSecreto.Model.ReservaEspaco;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Evento evento1 = new Evento(
                10,
                "Kaue Batista",
                "Girls Night",
                LocalDate.of(2003, 7, 7),
                LocalTime.of(21, 10),
                "Florianopolis",
                10,
                5
        );

        Evento evento2 = new Evento(
                11,
                "Kaue Batista",
                "Swing House",
                LocalDate.of(2013, 5, 7),
                LocalTime.of(21, 10),
                "Florianopolis",
                10,
                5
        );
        Evento evento3 = new Evento(
                16,
                "Kaue Batista",
                "Developers Night",
                LocalDate.of(2053, 7, 5),
                LocalTime.of(21, 10),
                "Florianopolis",
                10,
                5
        );
        Evento evento4 = new Evento(
                21,
                "Jose",
                "Gamers Night",
                LocalDate.of(2341, 7, 7),
                LocalTime.of(21, 10),
                "Florianopolis",
                10,
                5
        );

        Organizador organizadorKaue = new Organizador(
                "Kaue",
                10,
                "kauebatista3@gmail.com"
        );
        Organizador organizadorFrancisco = new Organizador(
                "Francisco",
                20,
                "francisco@gmail.com"
        );
        Organizador organizadorJunior = new Organizador(
                "Junior",
                30,
                "junior@gmail.com"
        );
        Organizador organizadorLucas = new Organizador(
                "Lucas",
                40,
                "lucas@gmail.com"
        );
        Organizador organizadorEverton = new Organizador(
                "Everton",
                50,
                "everton@gmail.com"
        );


        ReservaEspaco reserva1 = new ReservaEspaco(
                organizadorKaue,
                evento1
        );

        Calendario calendario = new Calendario();

        Organizador organizadorSelecionado = null;
        Scanner scanner = new Scanner(System.in);
        int escolhaDeOrganizador;
        int escolhaDoMenu;
        boolean rodarMenu = true;

        while(rodarMenu) {
            System.out.println("=".repeat(40));
            System.out.println("Escolha o Organizador do Evento\n1 - Kauê\n2 - Kokin\n3 - Junior\n4 - Lucas\n5 - Everton");
            System.out.println("=".repeat(40));
            escolhaDeOrganizador = scanner.nextInt();

            switch (escolhaDeOrganizador) {
                case 1:
                    organizadorSelecionado = organizadorKaue;
                    break;
                case 2:
                    organizadorSelecionado = organizadorFrancisco;
                    break;
                case 3:
                    organizadorSelecionado = organizadorJunior;
                    break;
                case 4:
                    organizadorSelecionado = organizadorLucas;
                    break;
                case 5:
                    organizadorSelecionado = organizadorEverton;
                    break;
                default:
                    System.out.println("Organizador selecionado incorretamente");
            }
            if (organizadorSelecionado != null) {
                organizadorSelecionado.exibirInfo();
                System.out.println("MENU\n1 - Exibir Eventos Agendados (Todos)\n2 - Exibir Eventos Agendados (Organizador)");
                System.out.println("=".repeat(40));
                escolhaDoMenu = scanner.nextInt();
                switch (escolhaDoMenu) {
                    case 1:
                        calendario.exibirEventos();
                        break;
                    case 2:
                        organizadorSelecionado.exibirEventosOrganizador(organizadorSelecionado);
                        break;
                }
            }
        }


//        reserva1.exibirInfo();
//        evento1.exibirInfo();
//        organizador1.exibirInfo();
//        reserva1.exibirInfo();

//        calendario.inserirEvento(evento1, organizador1);
//        calendario.inserirEvento(evento2, organizador1);
//        calendario.inserirEvento(evento3, organizador1);
//        calendario.cancelarEvento(organizador1, 16);
//        calendario.inserirEvento(evento4, organizador2);
//        calendario.exibirEventos();
    }
}