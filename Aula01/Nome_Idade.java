package Aula01;

import java.util.Scanner;

public class Nome_Idade 
{

	public static void main(String[] args) 
	{
//		System.out.println("Nome: Charles");
//		System.out.println("Endereço: Senai RS, 100");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome: "); 
		String nome = entrada.next(); //variavel string para receber o nome
		System.out.print("Idade: ");		
		int idade = entrada.nextInt(); //variavel int para receber a idade
		
		System.out.println("Nome: " + nome + " e idade: " + idade);
	}
}
