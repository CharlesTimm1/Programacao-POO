package Aula04;

import java.util.Scanner;

public class calculadoraClasse {

	
		int valor;
		String operacao;
	
		int somar(int a, int b) {
			int result = a + b;
			valor = result;
			operacao = "soma";
			return result;			
		}
		
		int subtrair(int a, int b) {
			int result = a - b;
			valor = result;
			operacao = "subtração";
			return result;
		}
		int ultimoResultado() {
			return valor;
		}
		String ultimaOperacao() {
			return operacao;
		}
		
		public static void main(String[] args) {
			calculadoraClasse calculadora = new calculadoraClasse();
			int x = 5;
			int y = 6;
			
			calculadora.subtrair(x, y);
			System.out.println("Operação realizada: " + 
					calculadora.ultimaOperacao());
			System.out.println("Resultado: " + 
					calculadora.ultimoResultado());
			
			calculadora.somar(x, y);
			System.out.println("Operação realizada: " + 
					calculadora.ultimaOperacao());
			System.out.println("Resultado: " + 
					calculadora.ultimoResultado());
		}
}
	
	
	
	
	
	