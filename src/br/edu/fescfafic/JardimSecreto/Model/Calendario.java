package br.edu.fescfafic.JardimSecreto.Model;

public class Calendario {
    public Evento[] eventosAgendados = new Evento[10];
    public int numEventosAgendados = 0;
    public boolean verificarDisponibilidade(Evento evento){
        boolean disponivel = false;
        for (int i = 0; i < eventosAgendados.length; i++){
            if (eventosAgendados[i] != null && eventosAgendados[i].dataDoEvento.equals(evento.dataDoEvento)){
                disponivel = true;
                System.out.println("\nData insdiponivel.");
            }
        }
        return disponivel;
    }
    public void inserirEvento(Organizador organizador, Evento evento){
        if (!verificarDisponibilidade(evento)){
            if (numEventosAgendados < eventosAgendados.length){
                if (organizador.quantidadeDeEventosOrganizados < organizador.eventosOrganizados.length){
                    organizador.eventosOrganizados[organizador.quantidadeDeEventosOrganizados] = evento;
                    organizador.quantidadeDeEventosOrganizados++;
                    eventosAgendados[numEventosAgendados] = evento;
                    numEventosAgendados++;
                    System.out.println("\nEvento cadastrado com sucesso.");
                }else {
                    System.out.println("\nOrganizador nao pode fazer mais eventos.");
                }
            }
        }else {
            System.out.println("\nLimite de Eventos Agendados.");
        }
    }
    public void cancelarEvento(Evento evento){
        for (int i = 0; i < eventosAgendados.length; i++){
            if (eventosAgendados[i] != null && eventosAgendados[i].idDoEvento == evento.idDoEvento){
                Evento excluir = eventosAgendados[i];
                eventosAgendados[i] = null;
                System.out.println("__________ Evento Cancelado __________");
                System.out.printf("\nNome do Evento: %s", excluir.nomeDoEvento);
                System.out.printf("\nData do Evento: %s", excluir.dataDoEvento);
                System.out.println("\n______________________________________");
                break;
            }
        }
    }
    public void exibirInfo(){
        for (int i = 0; i < numEventosAgendados; i++){
            if (eventosAgendados[i] != null){
                System.out.println("__________ Eventos Agendados __________");
                System.out.printf("ID: %s", this.eventosAgendados[i].idDoEvento);
                System.out.printf("\nNome do Evento: %s", this.eventosAgendados[i].nomeDoEvento);
                System.out.printf("\nData do Evento: %s", this.eventosAgendados[i].dataDoEvento);
                System.out.printf("\nHora do Evento: %s", this.eventosAgendados[i].horaDoEvento);
                System.out.printf("\nLocal do Evento: %s", this.eventosAgendados[i].localDoEvento);
                System.out.println("\n_______________________________________");
            }
        }

    }
}
