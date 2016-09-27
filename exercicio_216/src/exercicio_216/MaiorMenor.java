package exercicio_216;

import java.util.Scanner;

public class MaiorMenor {
	
	public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int n1 = scan.nextInt();
		
		System.out.print("Insira mais um número: ");
		int n2 = scan.nextInt();
		
		if (n1 > n2)
			System.out.print("\nO número " + n1 + " é o maior.");
		if (n2 > n1)
			System.out.print("\nO número " + n2 + " é o maior.");
		if (n1 == n2)
			System.out.print("\nOs números são iguais.");

	}

}
