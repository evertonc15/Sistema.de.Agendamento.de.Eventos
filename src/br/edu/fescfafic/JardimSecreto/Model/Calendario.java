package br.edu.fescfafic.JardimSecreto.Model;

public class Calendario {
    public Evento[] listaDeEventosAgendados = new Evento[10];
    public int numEventosAgendados = 0;

    public boolean verificarDisponibilidade(Evento evento) {
        boolean disponibilidade = false;
        for (int i = 0; i < listaDeEventosAgendados.length; i++) {
            if (listaDeEventosAgendados[i] != null && listaDeEventosAgendados[i].dataDoEvento == evento.dataDoEvento) {
                System.out.println("\nEsta data esta indisponiel!");
                disponibilidade = true;
            }
        }
        return disponibilidade;
    }
    public void inserirEvento(Evento evento, Organizador organizador) {
        if (!verificarDisponibilidade(evento)){
            if (numEventosAgendados < listaDeEventosAgendados.length) {
                if (organizador.quantidadeDeEventosOrganizados < organizador.eventosOrganizados.length){
                    organizador.eventosOrganizados[organizador.quantidadeDeEventosOrganizados] = evento;
                    organizador.quantidadeDeEventosOrganizados++;
                    listaDeEventosAgendados[numEventosAgendados] = evento;
                    numEventosAgendados++;
                    System.out.println("\nEvento cadastrado com sucesso.");
                }else {
                    System.out.println("\nOrganizador nao pode ter mais eventos registrados.");
                }
            } else {
                System.out.println("Calendario esta lotado!");
            }
        }
    }
    public void cancelarEvento(Organizador organizador, int id){
        boolean encontrou = false;
        for (int i = 0; i < listaDeEventosAgendados.length; i++){
            if (id == listaDeEventosAgendados[i].idDoEvento && organizador.nome.equalsIgnoreCase(listaDeEventosAgendados[i].organizadorDoEvento)){
                encontrou = true;
                listaDeEventosAgendados[i] = null;
                numEventosAgendados--;
                System.out.println("\nEvento cancelado!");
            }
        }if (!encontrou){
            System.out.println("\nEvento não encontrado.");
        }
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
