package br.edu.fescfafic.JardimSecreto.Model;
import java.time.LocalDate;

public class Calendario {
    public Evento[] agendamentosEventos = new Evento[5];

    //Metodos
    public boolean verificarDisponibilidade(LocalDate dataEvento) {
        boolean disponivel = true;
        for (int i = 0; i < agendamentosEventos.length; i++) {
            if (this.agendamentosEventos[i] != null && this.agendamentosEventos[i].dataEvento.equals(dataEvento)) {
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
                System.out.println("Evento inserido");
                return;
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
}
