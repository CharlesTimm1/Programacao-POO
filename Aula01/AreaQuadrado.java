package Aula01;

import java.util.Scanner;

public class AreaQuadrado 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa para mostrar a area de um quadrado");
		System.out.print("Digite o valor de um dos lados do quadrado: "); 
		float var1 = entrada.nextInt(); 
	    float calc = var1 * var1;
	    System.out.print("A area do quadrado é: " + calc);
	}
}