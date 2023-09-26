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
                "Girls Night",
                LocalDate.of(2003, 7, 7),
                LocalTime.of(21, 10),
                "Florianopolis"
        );

        Evento evento2 = new Evento(
                11,
                "Swing House",
                LocalDate.of(2004, 7, 7),
                LocalTime.of(21, 10),
                "Florianopolis"
        );
        Evento evento3 = new Evento(
                16,
                "Developers Night",
                LocalDate.of(2003, 7, 7),
                LocalTime.of(21, 10),
                "Florianopolis"
        );
        Evento evento4 = new Evento(
                21,
                "Gamers Night",
                LocalDate.of(2003, 7, 7),
                LocalTime.of(21, 10),
                "Florianopolis"
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
        boolean organizadorRodarMenu;

        calendario.inserirEvento(evento1, organizadorKaue);
        calendario.inserirEvento(evento2, organizadorKaue);
        calendario.cancelarEvento(organizadorKaue, 11);

        while(rodarMenu) {
            System.out.println("=".repeat(40));
            System.out.println("Escolha o Organizador do Evento\n1 - Kauê\n2 - Kokin\n3 - Junior\n4 - Lucas\n5 - Everton\n0 - Encerrar Sistema");
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
                case 0:
                    rodarMenu = false;
            }
            if (organizadorSelecionado != null) {
                organizadorRodarMenu = true;
                organizadorSelecionado.exibirInfo();
                while(organizadorRodarMenu) {
                    System.out.println("=".repeat(40));
                    System.out.println("MENU\n1 - Exibir Eventos Agendados (Todos)\n2 - Exibir Eventos Agendados (Organizador)\n0 - Encerrar Menu");
                    System.out.println("=".repeat(40));
                    escolhaDoMenu = scanner.nextInt();
                    switch (escolhaDoMenu) {
                        case 1:
                            calendario.exibirEventos();
                            break;
                        case 2:
                            organizadorSelecionado.exibirEventosOrganizador(organizadorSelecionado);
                            break;
                        case 0:
                            organizadorRodarMenu = false;
                            organizadorSelecionado = null;
                    }
                }
            }
        }
    }
}