package Aula05;

import java.util.Scanner;

public class NotaFiscal {
	String nomeItem1;
	String nomeItem2;
	float precoItem1;
	float precoItem2;
	
	float calculadoraNotaFiscal() {
		float result = (precoItem1 + precoItem2)/2;
		return result;
		
		//da pra ser : return (precoItem1 + precoItem2)/2
	}
	
	String mostraNomeItem1() {
		return nomeItem1;
	}
	
	String mostraNomeItem2() {
		return nomeItem2;
	}
}