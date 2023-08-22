package Aula05;

public class imprimeNota {
	
	public static void main (String[] args) {
		NotaFiscal nota1 = new NotaFiscal();
		NotaFiscal nota2 = new NotaFiscal();
		NotaFiscal nota3 = new NotaFiscal();

	
		nota1.nomeItem1 = "Mochila";
		nota1.nomeItem2 = "Caderno";
		nota1.precoItem1 = 99.9f;
		nota1.precoItem2 = 10.5f;
		
		nota2.nomeItem1 = "Hotwells";
		nota2.nomeItem2 = "Amoeba";
		nota2.precoItem1 = 13.5f;
		nota2.precoItem2 = 12f;
		
		nota3.nomeItem1 = "Play4";
		nota3.nomeItem2 = "Play5";
		nota3.precoItem1 = 1999.9f;
		nota3.precoItem2 = 2999.5f;
		
		System.out.println("Item 1 : " + nota1.mostraNomeItem1());
		System.out.println("Item 2 : " + nota1.mostraNomeItem2());
		System.out.println("Media : " + nota1.calculadoraNotaFiscal());
		
		System.out.println();
		
		System.out.println("Item 1 : " + nota2.mostraNomeItem1());
		System.out.println("Item 2 : " + nota2.mostraNomeItem2());
		System.out.println("Media : " + nota2.calculadoraNotaFiscal());
		
		System.out.println();
		
		System.out.println("Item 1 : " + nota3.mostraNomeItem1());
		System.out.println("Item 2 : " + nota3.mostraNomeItem2());
		System.out.println("Media : " + nota3.calculadoraNotaFiscal());
	}	
}
