package Aula04;

public class mainCalculadora {
	
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
