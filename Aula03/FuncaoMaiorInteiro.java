package Aula03;

import java.util.Scanner;

public class FuncaoMaiorInteiro 
{
	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa para dizer qual inteiro é maior");
		System.out.println("Digite um valor inteiro: ");
		int var1 = entrada.nextInt();
		System.out.println("Digite o segundo valor inteiro: ");
		int var2 = entrada.nextInt(); 
		if (var1>var2) 
		{
			System.out.println("O int maior é: " + var1 );
		}
		else
		{
			System.out.println("O int maior é: " + var2);
		}
	}
	public static String maiorValorV2 (int y) {
		
	}
}


