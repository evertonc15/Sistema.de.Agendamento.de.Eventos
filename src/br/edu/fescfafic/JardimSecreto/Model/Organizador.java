package br.edu.fescfafic.JardimSecreto.Model;

public class Organizador extends Pessoa{
    public Evento[] eventosOrganizados = new Evento[3];
    public int quantidadeDeEventosOrganizados = 0;
    public Organizador(String nome, int id, String email){
        super(nome, id, email);
        this.nomeDoOrganizador = nome;
        this.idDoOrganizador = id;
        this.email = email;
    }

    @Override
    public void exibirInfo(){
        System.out.println("__________ Dados Do Organizador __________");
        System.out.printf("Nome do Organizador: %s", this.nomeDoOrganizador);
        System.out.printf("\nId do Organizador: %s", this.idDoOrganizador);
        System.out.printf("\nEmail do Organizador: %s", this.email);
        System.out.printf("\nEventos Organizados: %s", this.eventosOrganizados.length);
        if (this.eventosOrganizados.length > 0) {
            for(int i = 0; i < this.eventosOrganizados.length; i++) {
                System.out.printf("\nEvento %s:", i);
                this.eventosOrganizados[i].exibirInfo();
            }
        }
        System.out.println("\n__________________________________________");
    }
}
