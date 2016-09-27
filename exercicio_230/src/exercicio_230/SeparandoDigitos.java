package exercicio_230;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SeparandoDigitos {
	
	public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int numero,
        quinto,
        quarto,
        terceiro,
        segundo,
        primeiro;
		
    System.out.print("Insira um número inteiro com cinco dígitos: ");
    numero = scan.nextInt();
    
    quinto = numero % 10;
    numero /= 10;
    quarto = numero % 10;
    numero /= 10;
    terceiro = numero% 10;
    numero /= 10;
    segundo = numero % 10;
    numero /= 10;
    primeiro = numero % 10;
    
    System.out.printf("%d   %d   %d   %d   %d",primeiro, segundo, terceiro, quarto, quinto);
		
	
	}

}
