package exercicio_215;

import java.util.Scanner;

public class Operacoes {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira um n�mero: ");
		int n1 = scan.nextInt();
		
		System.out.print("Insira mais um n�mero: ");
		int n2 = scan.nextInt();
		
		int r1 = n1 + n2;
		int r2 = n1 * n2;
		int r3 = n1 - n2;
		int r4 = n1 / n2;
		
		System.out.println("\nA soma dos n�meros �: " + r1);
		System.out.println("O produto dos n�meros �: " + r2);
		System.out.println("A diferen�a dos n�meros �: " + r3);
		System.out.println("O quociente dos n�meros �: " + r4);
	}

}
