package Aula03;

import java.util.Scanner;

public class Media3NotasComFuncao 
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
		
		situacaoAluno(n1, n2, n3); 
		//chamei a função resultado jogando os dados dos n123 existentes no main
		
		String statusAluno = situacaoAluno (n1, n2, n3);
	//variavel nome.variavel = função
		System.out.printf (statusAluno);
			  			 //variavel
		entrada.close();
	}		
	public static String situacaoAluno (float nota1, float nota2, float nota3) { //criei a função
		float media = ( nota1 + nota2 + nota3 ) /3;//calculo com os valores da função recebido da main(n123)
		//variavel 
		
		String statusAluno; // criei variavel dentro da função
		if(media >= 7.0) {
			statusAluno = "Parabens voce esta aprovado " + media;
		}else if(media >= 5.0 && media < 7.0) {
			statusAluno = "Voce esta em recuperação " + media;
		}else {
			statusAluno = "Voce esta reprovado " + media;
		}
		return statusAluno; //serve para nao por return em todas os elses
	}
}
