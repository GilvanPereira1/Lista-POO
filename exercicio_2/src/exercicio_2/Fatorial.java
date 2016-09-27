package exercicio_2;

import java.util.Scanner;

public class Fatorial {
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Insira um número: ");
		int fator = scan.nextInt();
		
		int x = fator;
		int f = x;
		System.out.print(fator + "! = ");
		
		while (x > 1) {
			f = f*(x-1);
			System.out.print(x + "*");
			x--;
		
		}
		System.out.print(1 + " = " +f);
		scan.close();
	}
	

}
