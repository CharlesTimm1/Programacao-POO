package Ativ03;

public class Computador {
	String nome;
	int clock;
	
	String mostraNomeComputador() {
		System.out.println("Nome do computador: " + nome);
			return nome;
	}
	
	  int mostraClock() {
		  System.out.println("Horas: " + clock);
			return clock;
	  }
}
