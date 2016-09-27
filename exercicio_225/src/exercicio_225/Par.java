package exercicio_225;

import java.util.Scanner;

public class Par {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		int n = scan.nextInt();
		
		if ((n % 2) == 0)
			System.out.println("O número é par.");
		else
			System.out.println("O número é ímpar.");
	}

}
