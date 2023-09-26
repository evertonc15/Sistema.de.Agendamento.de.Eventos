package br.edu.fescfafic.JardimSecreto.Model;

import java.time.LocalDate;

public class Calendario {
    public Evento[] eventosAgendados = new Evento[10];
    public int quantidadeDeEventosAgendados = 0;

    public void inserirEvento(Evento evento, Organizador organizador){
        if (!verificarDisponibilidade(evento)) {
            if (quantidadeDeEventosAgendados < eventosAgendados.length) {
                if (organizador.quantidadDeEventosDoOrganizador < organizador.eventosOrganizados.length) {
                    organizador.eventosOrganizados[organizador.quantidadDeEventosDoOrganizador] = evento;
                    organizador.quantidadDeEventosDoOrganizador++;
                    eventosAgendados[quantidadeDeEventosAgendados] = evento;
                    quantidadeDeEventosAgendados++;
                    System.out.println("\nEvento cadastrado com sucesso.");
                } else {
                    System.out.println("\nO Organizador não tem mais espacos para eventos");
                }
            } else {
                System.out.println("\nLimite de eventos agendados");
            }
        }
    }

    public void exibirEventos(){
        for(int i = 0; i < eventosAgendados.length; i++){
            if(eventosAgendados[i] != null) {
                System.out.println("=".repeat(40));
                System.out.println(eventosAgendados[i].nomeDoEvento);
                System.out.println(eventosAgendados[i].idDoEvento);
                System.out.println(eventosAgendados[i].dataDoEvento);
                System.out.println(eventosAgendados[i].horaDoEvento);
                System.out.println(eventosAgendados[i].localDoEvento);
            }
        }if(quantidadeDeEventosAgendados < 1){
            System.out.println("=".repeat(40));
            System.out.println("Não temos eventos agendados");
            System.out.println("=".repeat(40));
        }

    }

    public void cancelarEvento(Organizador org, int id){
        boolean eventoEncontrado = false;
        for(int i = 0; i < eventosAgendados.length; i++) {
            if (eventosAgendados[i] != null && id == eventosAgendados[i].idDoEvento) {
                eventoEncontrado = true;
                eventosAgendados[i] = null;
                quantidadeDeEventosAgendados--;
                for (int j = 0; j < org.eventosOrganizados.length; j++) {
                    if(org.eventosOrganizados[j] != null && id == org.eventosOrganizados[j].idDoEvento) {
                        System.out.println("=".repeat(40));
                        System.out.printf("\nNome do Evento: %s", org.eventosOrganizados[j].nomeDoEvento);
                        System.out.printf("\nData do Evento: %s", org.eventosOrganizados[j].dataDoEvento);
                        System.out.println("\nEvento cancelado com sucesso");
                        System.out.println("=".repeat(40));
                        org.eventosOrganizados[j] = null;
                        org.quantidadDeEventosDoOrganizador--;
                    }
                }
            }
        }
        if(!eventoEncontrado){
            System.out.print("Evento não encontrado, não podemos cancelar");
        }

    }

    public boolean verificarDisponibilidade(Evento evento){
        boolean dataInvalida = false;
        for(int i = 0; i < eventosAgendados.length; i++){
            if (eventosAgendados[i] != null && eventosAgendados[i].dataDoEvento.equals(evento.dataDoEvento)) {
                System.out.println("Data indisponivel");
                dataInvalida = true;
                break;
            }
        }
        return dataInvalida;
    }
}