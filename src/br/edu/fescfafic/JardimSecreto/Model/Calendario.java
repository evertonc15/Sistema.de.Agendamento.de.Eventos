package br.edu.fescfafic.JardimSecreto.Model;

import java.time.LocalDate;

public class Calendario {
    public Evento[] eventosAgendados = new Evento[4];


    public void inserirEvento(Evento evento) {
        for (int i = 0; i < eventosAgendados.length; i++) {
            if (eventosAgendados[i] == null && this.verificarDisponiblidade(evento.dataEvento)) {
                eventosAgendados[i] = evento;
                System.out.println("Evento adicionado como sucesso");
                return;
            }else if (eventosAgendados[i] == null && !verificarDisponiblidade(evento.dataEvento)){
                System.out.println("Data indisponível");
                return;
            }

        }
    }

    public boolean verificarDisponiblidade(LocalDate data) {
        for (int i = 0; i < eventosAgendados.length; i++) {
            if (eventosAgendados[i] != null && eventosAgendados[i].dataEvento.equals(data)) {
                return false;
            }
        }
        return true;
    }
}











