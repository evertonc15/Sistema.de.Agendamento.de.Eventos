package br.edu.fescfafic.JardimSecreto.Model;

public class Calendario {
    public Evento[] listaDeEventosAgendados;
    public int numEventosAgendados;

    public Calendario(int maxEventos) {
        listaDeEventosAgendados = new Evento[maxEventos];
        this.numEventosAgendados = 0;
    }

    public boolean verificarDisponibilidade(Evento evento) {
        boolean disponibilidade = false;
        for (int i = 0; i < listaDeEventosAgendados.length; i++) {
            if (listaDeEventosAgendados[i] != null && listaDeEventosAgendados[i].dataDoEvento == evento.dataDoEvento) {
                System.out.println("\nEsta data esta indisponiel!");
                disponibilidade = true;
            }
        }
        if (!disponibilidade) {
            System.out.println("\nData disponivel!");
        }
        return disponibilidade;
    }

    public void inserirEvento(Evento evento) {
        if (!verificarDisponibilidade(evento)){
            if (numEventosAgendados < listaDeEventosAgendados.length) {
                listaDeEventosAgendados[numEventosAgendados] = evento;
                numEventosAgendados++;
            } else {
                System.out.println("Calendario esta lotado!");
            }
        }
    }
    public void cancelarEvento(){
        for (int i = 0; i < listaDeEventosAgendados.length; i++){
            if (numEventosAgendados < listaDeEventosAgendados.length){
                listaDeEventosAgendados[numEventosAgendados] = null;
                numEventosAgendados--;
            }
        }
        System.out.println("\nEvento cancelado!");
    }
    public void listarEventosAgendados(){
        System.out.println("\nEventos Agendados: ");
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
