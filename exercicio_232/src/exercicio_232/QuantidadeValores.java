package exercicio_232;

import java.util.Scanner;

public class QuantidadeValores {
	
	public static void main (String[] args){
		
		
		int positivo = 0;
		int negativo = 0;
		int zero = 0;
		
		Scanner scan = new Scanner(System.in);

		for(int i = 0; i < 5; i++){
		 System.out.print("Digite um n�mero: ");
		 int n = scan.nextInt();
		 
		 if(n>0) 
			positivo+=1;
			
		 if(n<0) 
			 negativo+=1;
			
		 if(n==0) 
			 zero+=1;
		 
		}
		System.out.println("Quantidade de n�meros positivos: " +positivo);
		System.out.println("Quantidade de n�meros negativos: " +negativo);
		System.out.println("Quantidade de n�meros zeros: " +zero);
	}
}

