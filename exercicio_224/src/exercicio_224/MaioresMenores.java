package exercicio_224;

import java.util.Scanner;

public class MaioresMenores {
	
	public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira cinco n�meros inteiros: ");
		
		System.out.print("Primeiro: ");
		int n1 = scan.nextInt();
		
		System.out.print("Segundo: ");
		int n2 = scan.nextInt();
		
		System.out.print("Terceiro: ");
		int n3 = scan.nextInt();
		
		System.out.print("Quarto: ");
		int n4 = scan.nextInt();
		
		System.out.print("Quinto: ");
		int n5 = scan.nextInt();
		
		if ((n1>n2)&&(n1>n3)&&(n1>n4)
		&&(n1>n5))
			System.out.println("O n�mero " + n1 + " � o maior.");
		
		if ((n1<n2)&&(n1<n3)&&(n1<n4)
				&&(n1<n5))
					System.out.println("\nO n�mero " + n1 + " � o menor.");
		
		if ((n2>n1)&&(n2>n3)&&(n2>n4)
				&&(n2>n5))
					System.out.println("\nO n�mero " + n2 + " � o maior.");
		if ((n2<n1)&&(n2<n3)&&(n2<n4)
				&&(n2<n5))
					System.out.println("O n�mero " + n2 + " � o menor.");
		
		if ((n3>n1)&&(n3>n2)&&(n3>n4)
				&&(n3>n5))
					System.out.println("O n�mero " + n3 + " � o maior.");
		if ((n3<n1)&&(n3<n2)&&(n3<n4)
				&&(n3<n5))
					System.out.println("O n�mero " + n3 + " � o menor.");
		
		if ((n4>n1)&&(n4>n2)&&(n4>n3)
				&&(n4>n5))
					System.out.println("O n�mero " + n4 + " � o maior.");
		if ((n4<n1)&&(n4<n2)&&(n4<n3)
				&&(n4<n5))
					System.out.println("O n�mero " + n4 + " � o menor.");
		
		if ((n5>n1)&&(n5>n2)&&(n5>n3)
				&&(n5>n4))
					System.out.println("O n�mero " + n5 + " � o maior.");
		if ((n5<n1)&&(n5<n2)&&(n5<n3)
				&&(n5<n4))
					System.out.println("O n�mero " + n5 + " � o menor.");
		}
	}
	
	


