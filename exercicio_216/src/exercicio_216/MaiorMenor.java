package exercicio_216;

import java.util.Scanner;

public class MaiorMenor {
	
	public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira um n�mero: ");
		int n1 = scan.nextInt();
		
		System.out.print("Insira mais um n�mero: ");
		int n2 = scan.nextInt();
		
		if (n1 > n2)
			System.out.print("\nO n�mero " + n1 + " � o maior.");
		if (n2 > n1)
			System.out.print("\nO n�mero " + n2 + " � o maior.");
		if (n1 == n2)
			System.out.print("\nOs n�meros s�o iguais.");

	}

}
