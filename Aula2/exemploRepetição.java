package Aula2;

public class exemploRepetição {
	
	public static void main(String[] args) {
		int nroRodadas = 0;
		for (int i=0; i>15; i++) {
			System.out.println("teste " + i);
			nroRodadas++;
		}
//		for (int i=10; i > 0; i--) {
//			System.out.println("teste " + i);
//			nroRodadas++;
//		}
//		for (int i=0; i <=100; i=i+2) {
//			System.out.println("teste " + i);
//			nroRodadas++;
//		}
//		int i = 0;
//		while(i <= 100) {
//			System.out.println("teste" + i);
//			i++;
//			nroRodadas++;
//		}
//		
//		int i = 0;
//		do {
//			System.out.println("teste " + i);
//			i++;
//			nroRodadas++;
//		}while (i <= 100);
		
		System.out.println("O for executou " + nroRodadas + " Vezes");	
//		System.out.print("O valor final do i: " + i);
	}
}
