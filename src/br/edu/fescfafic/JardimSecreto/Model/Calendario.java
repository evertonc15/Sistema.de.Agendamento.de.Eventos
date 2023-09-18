package br.edu.fescfafic.JardimSecreto.Model;


import java.time.LocalDate;

public class Calendario {
    public Evento[] listaDeEventosAgendados ;
    public int numEventosAgendados;

    public Calendario(int maxEventos){
        listaDeEventosAgendados = new Evento[maxEventos];
        this.numEventosAgendados = 0;
    }
    public void verificarDisponibilidade(Evento evento){
        boolean disponibilidade = false;
       for (int i =0; i < listaDeEventosAgendados.length; i++){
           if (listaDeEventosAgendados[i] != null && listaDeEventosAgendados[i].dataDoEvento == evento.dataDoEvento){
               System.out.println("Esta data esta indisponiel!");
               disponibilidade = true;
           }
       }if (!disponibilidade){
            System.out.println("Data disponivel!");
        }
    }
    public void inserirEvento(Evento evento){
        if (numEventosAgendados < listaDeEventosAgendados.length){
            listaDeEventosAgendados[numEventosAgendados] = evento;
            numEventosAgendados++;
        }else {
            System.out.println("Calendario esta lotado!");
        }
    }
    public void listarEventosAgendados(){
        System.out.println("Eventos Agendados: ");
        for (int i = 0; i < numEventosAgendados; i++){
            Evento evento = listaDeEventosAgendados[i];
            System.out.printf("ID: %s", evento.idDoEvento);
            System.out.printf("\nNome do Evento: %s", evento.nomeDoEvento);
            System.out.printf("\nData: %s", evento.dataDoEvento);
            System.out.printf("\nHora: %s", evento.horaDoEvento);
            System.out.printf("\nLocal: %s", evento.localDoEvento);
        }
    }
}
