package exercicio_225;

import java.util.Scanner;

public class Par {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um n�mero: ");
		int n = scan.nextInt();
		
		if ((n % 2) == 0)
			System.out.println("O n�mero � par.");
		else
			System.out.println("O n�mero � �mpar.");
	}

}
