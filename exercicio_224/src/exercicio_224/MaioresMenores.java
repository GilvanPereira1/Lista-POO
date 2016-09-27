package exercicio_224;

import java.util.Scanner;

public class MaioresMenores {
	
	public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira cinco números inteiros: ");
		
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
			System.out.println("O número " + n1 + " é o maior.");
		
		if ((n1<n2)&&(n1<n3)&&(n1<n4)
				&&(n1<n5))
					System.out.println("\nO número " + n1 + " é o menor.");
		
		if ((n2>n1)&&(n2>n3)&&(n2>n4)
				&&(n2>n5))
					System.out.println("\nO número " + n2 + " é o maior.");
		if ((n2<n1)&&(n2<n3)&&(n2<n4)
				&&(n2<n5))
					System.out.println("O número " + n2 + " é o menor.");
		
		if ((n3>n1)&&(n3>n2)&&(n3>n4)
				&&(n3>n5))
					System.out.println("O número " + n3 + " é o maior.");
		if ((n3<n1)&&(n3<n2)&&(n3<n4)
				&&(n3<n5))
					System.out.println("O número " + n3 + " é o menor.");
		
		if ((n4>n1)&&(n4>n2)&&(n4>n3)
				&&(n4>n5))
					System.out.println("O número " + n4 + " é o maior.");
		if ((n4<n1)&&(n4<n2)&&(n4<n3)
				&&(n4<n5))
					System.out.println("O número " + n4 + " é o menor.");
		
		if ((n5>n1)&&(n5>n2)&&(n5>n3)
				&&(n5>n4))
					System.out.println("O número " + n5 + " é o maior.");
		if ((n5<n1)&&(n5<n2)&&(n5<n3)
				&&(n5<n4))
					System.out.println("O número " + n5 + " é o menor.");
		}
	}
	
	


