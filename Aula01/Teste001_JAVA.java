package Aula01;
import java.util.Scanner;
public class Teste001_JAVA 
{

	public static void main(String[] args) 
	{
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.print("Entre com uma string: ");
        String var3 = entrada.next();
        
        System.out.print("Entre com um numero: ");
        int var1 = entrada.nextInt();
        System.out.print("Entre com um numero: ");
        int var2 = entrada.nextInt();
        System.out.println(var1 + " e " + var2); //CONCATENAÇÃO 
        System.out.println(var1 + var2); 
	}

}