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

    public Evento cancelarEvento(Evento idCancelar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o código do evento que deseja cancelar: ");
        int confirmarID = sc.nextInt();
        for (int i = 0; i < agendamentosEventos.length; i++) {
            if (agendamentosEventos[i]!=null&&agendamentosEventos[i].equals(idCancelar.idEvento)) {
                agendamentosEventos[i] = null;
                break;
            }
        }
        System.out.printf("Evento %s excluído %n", idCancelar.idEvento);



//        for(int i=0;i< agendamentosEventos.length;i++){
//            if(agendamentosEventos[i]!=null&&)
        return idCancelar;
    }

}

