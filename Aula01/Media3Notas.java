package Aula01;

import java.util.Scanner;

public class Media3Notas 
{
	public static void main(String[] args) 
	{
	
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Programa para dizer a media de um aluno");
		System.out.println("Digite sua primeira nota: ");
		float n1 = entrada.nextInt();
		System.out.println("Digite sua segunda nota: ");
		float n2 = entrada.nextInt();
		System.out.println("Digite sua terceira nota: ");
		float n3 = entrada.nextInt();
		
		float media = (n1 + n2 + n3)/3;
	
		if(media >= 7.0) {
			System.out.print("Parabens voce esta aprovado " + media);
		}else if(media >= 5.0 && media < 7.0) {
			System.out.print("Voce esta em recuperação " + media);
		}else {
		System.out.print("Voce esta reprovado " + media);
		}
	}		
}
