package exercicio_215;

import java.util.Scanner;

public class Operacoes {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int n1 = scan.nextInt();
		
		System.out.print("Insira mais um número: ");
		int n2 = scan.nextInt();
		
		int r1 = n1 + n2;
		int r2 = n1 * n2;
		int r3 = n1 - n2;
		int r4 = n1 / n2;
		
		System.out.println("\nA soma dos números é: " + r1);
		System.out.println("O produto dos números é: " + r2);
		System.out.println("A diferença dos números é: " + r3);
		System.out.println("O quociente dos números é: " + r4);
	}

}
