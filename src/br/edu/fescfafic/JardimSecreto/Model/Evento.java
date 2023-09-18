package br.edu.fescfafic.JardimSecreto.Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Evento {
   public int idDoEvento;
   public String nomeDoEvento;
   public LocalDate dataEvento;
   public LocalTime horaEvento;
   public String localDoEvento;
   public int capacidadeDeParticipantes [] = new int[500];
   public int quantidadeDePessoas;

   public Evento( int idDoEvento, String nomeDoEvento, LocalDate dataEvento, LocalTime horaEvento, String localDoEvento, int quantidadeDePessoas ) {
       this.idDoEvento = idDoEvento;
       this.nomeDoEvento = nomeDoEvento;
       this.dataEvento = dataEvento;
       this.horaEvento = horaEvento;
       this.localDoEvento = localDoEvento;
       this.quantidadeDePessoas = quantidadeDePessoas;

   }
       public void exibirInfo(){
           System.out.println("__________________EVENTOS____________________");
           System.out.println("ID do Evento: " + this.idDoEvento);
           System.out.println("Nome do Evento: " + this.nomeDoEvento);
           System.out.println("Data: " + this.dataEvento);
           System.out.println("Horário: " + this.horaEvento);
           System.out.println("Local: " + this.localDoEvento);
           System.out.println("Número de Participantes: " + this.quantidadeDePessoas);
           System.out.println("Capacidade do evento: " + this.capacidadeDeParticipantes.length + " Pessoas");
           System.out.println("_____________________________________________");

       }
   }