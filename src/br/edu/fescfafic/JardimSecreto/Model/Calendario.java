package br.edu.fescfafic.JardimSecreto.Model;

public class Calendario {
    public Evento[] eventosAgendados = new Evento[10];
    public int quantidadeDeEventosAgendados = 0;

    public void inserirEvento(Evento evento, Organizador organizador){
        if (quantidadeDeEventosAgendados < eventosAgendados.length) {
            if (organizador.quantidadDeEventosDoOrganizador < organizador.eventosOrganizados.length) {
                organizador.eventosOrganizados[organizador.quantidadDeEventosDoOrganizador] = evento;
                organizador.quantidadDeEventosDoOrganizador++;
                eventosAgendados[quantidadeDeEventosAgendados] = evento;
                quantidadeDeEventosAgendados++;
                System.out.println("\nEvento cadastrado com sucesso.");
            }else{
                System.out.println("\nO Organizador não tem mais espacos para eventos");
            }
        }else{
            System.out.println("\nLimite de eventos agendados");
        }
    }

    public void exibirEventos(){
        for(int i = 0; i < quantidadeDeEventosAgendados; i++){
            if(eventosAgendados[i] != null) {
                System.out.println("\n" + eventosAgendados[i].nomeDoEvento);
                System.out.println(eventosAgendados[i].idDoEvento);
                System.out.println(eventosAgendados[i].dataDoEvento);
                System.out.println(eventosAgendados[i].horaDoEvento);
                System.out.println(eventosAgendados[i].localDoEvento);
                System.out.println(eventosAgendados[i].capacidadeTotalDoEvento);
            }
        }if(quantidadeDeEventosAgendados < 1){
            System.out.println("Não temos eventos agendados");
        }

    }

    public void cancelarEvento(Organizador org, int id){
        boolean eventoEncontrado = false;
        for(int i = 0; i < quantidadeDeEventosAgendados; i++) {
            if (id == eventosAgendados[i].idDoEvento && org.nomedoOrganizador.equalsIgnoreCase(eventosAgendados[i].organizadorDoEvento)) {
                eventoEncontrado = true;
                eventosAgendados[i] = null;
                quantidadeDeEventosAgendados--;
                for (int j = 0; j < org.quantidadDeEventosDoOrganizador; j++) {
                    if(id == org.eventosOrganizados[j].idDoEvento) {
                        org.eventosOrganizados[j] = null;
                        org.quantidadDeEventosDoOrganizador--;
                        System.out.print("\nEvento cancelado com sucesso");
                    }
                }
            }
        }
        if(!eventoEncontrado){
            System.out.print("Evento não encontrado, não podemos cancelar");
        }

    }

    public void verificarDisponibilidade(){
        for(int i = 0; i < quantidadeDeEventosAgendados; i++){
            if (eventosAgendados[i] != null) {
                System.out.println("Data indisponivel - " + eventosAgendados[i].dataDoEvento);
            }
        }
    }
}
