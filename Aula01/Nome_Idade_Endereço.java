package Aula01;

import java.util.Scanner; 

public class Nome_Idade_Endereço {
public static void main (String[] args) {
	
	Scanner entrada= new Scanner(System.in);
	
		String nome = "Charles";
		String endereço = "Avenida Assis Brasil 1000";
		int idade = 20;
		
		System.out.println("Meu nome é " + nome);
		System.out.println("Meu endereço é " + endereço);
		System.out.println("Minha idade é " + idade);
		System.out.print("Seu nome é: ");
		
		String nome1 = entrada.next();
		System.out.print("Sua Idade é: ");
		String idade1 = entrada.next();
		
		System.out.println("Seu nome é " + nome1 + " e sua idade é " + idade1 + " anos ");
		entrada.close();
	}

}
