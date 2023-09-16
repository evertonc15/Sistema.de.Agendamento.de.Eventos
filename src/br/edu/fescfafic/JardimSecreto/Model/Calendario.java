package br.edu.fescfafic.JardimSecreto.Model;

import java.time.LocalDate;
import java.util.Scanner;

public class Calendario {
    public Evento[] agendamentosEventos = new Evento[6];

    //Metodos
    public boolean verificarDisponibilidade(LocalDate dataEvento) {
        boolean disponivel = true;
        for (int i = 0; i < agendamentosEventos.length; i++) {
            if (agendamentosEventos[i] != null && agendamentosEventos[i].dataEvento.equals(dataEvento)) {
                disponivel = false;
            }
        }
        return disponivel;
    }

    public void inserirEvento(Evento evento) {
        for (int i = 0; i < agendamentosEventos.length; i++) {
            //verifica se é nulo para evitar dados preenchidos
            if (agendamentosEventos[i] == null && this.verificarDisponibilidade(evento.dataEvento)) {
                agendamentosEventos[i] = evento;
                //print de teste
                System.out.printf("Evento %s inserido%n", evento.nomeEvento);
                break;
            }
        }
    }

    public void exibirInfo() {
        for (int i = 0; i < agendamentosEventos.length; i++) {
            if (agendamentosEventos[i] != null) {
                agendamentosEventos[i].exibirInfo();
            }
        }
    }
    public Evento cancelarEvento() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o código do evento que deseja cancelar: ");
        int confirmarID = sc.nextInt();
        System.out.println();
        for (int i = 0; i < agendamentosEventos.length; i++) {
            if (agendamentosEventos[i] != null && agendamentosEventos[i].idEvento == confirmarID) {
                Evento excluido = agendamentosEventos[i];
                agendamentosEventos[i] = null;
                System.out.println("-----= EVENTO CANCELADO =-----");
                System.out.printf("Tema do Evento: %s%n", excluido.nomeEvento);
                System.out.printf("Data Cancelada: %s%n", excluido.dataEvento);
                System.out.println("--".repeat(15));
                break;
            }
        }
        return null;
    }
}



