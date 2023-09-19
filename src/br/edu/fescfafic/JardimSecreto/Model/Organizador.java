package br.edu.fescfafic.JardimSecreto.Model;

public class Organizador {
    public String nomedoOrganizador;
    public int id;
    public String email;
    public Evento[] eventosOrganizados = new Evento[3];
    public int quantidadDeEventosDoOrganizador = 0;

    public Organizador(String nomedoOrganizador, int id, String email) {
        this.nomedoOrganizador = nomedoOrganizador;
        this.id = id;
        this.email = email;
    }

    public void exibirInfo(){
        System.out.println("=".repeat(40));
        System.out.printf("Nome - %s", nomedoOrganizador);
        System.out.printf("\nID - %d", id);
        System.out.printf("\nEmail - %s\n", email);
        System.out.println("=".repeat(40));
    }

    public void exibirEventosOrganizador(Organizador org){
        for(int i = 0; i < quantidadDeEventosDoOrganizador; i++){
            if(org.eventosOrganizados[i] != null) {
                System.out.println("\n" + org.eventosOrganizados[i].nomeDoEvento);
                System.out.println(org.eventosOrganizados[i].idDoEvento);
                System.out.println(org.eventosOrganizados[i].dataDoEvento);
                System.out.println(org.eventosOrganizados[i].horaDoEvento);
                System.out.println(org.eventosOrganizados[i].localDoEvento);
                System.out.println(org.eventosOrganizados[i].capacidadeTotalDoEvento);
            }
        }if(quantidadDeEventosDoOrganizador < 1){
            System.out.println("Não temos eventos agendados");
        }
    }
}
