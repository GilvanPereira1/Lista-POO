package exercicio_316;

import java.util.Scanner;

public class HeartRatesTest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = scan.nextLine();

		System.out.print("Digite seu sobrenome: ");
		String sobrenome = scan.nextLine();
		
		System.out.print("Digite o mês do seu nascimento: ");
		int mes = scan.nextInt();
		
		System.out.print("Digite o dia do seu nascimento: ");
		int dia = scan.nextInt();
		
		System.out.print("Digite o ano do seu nascimento: ");
		int ano = scan.nextInt();
		
		System.out.println("\nInforme a data de hoje:");
		System.out.print("Mês: ");
		int mesAtual = scan.nextInt();
		
		System.out.print("Dia: ");
		int diaAtual = scan.nextInt();
		
		System.out.print("Ano: ");
		int anoAtual = scan.nextInt();
		HeartRates heart = new HeartRates(nome, sobrenome, mes, dia, ano);
		
		System.out.print("\nNome: "+ heart.getNome()+"\nSobrenome: "+ 
		heart.getSobrenome()+"\nData de nascimento: "+heart.getMes()+"/"+heart.getDia()+"/"+
				heart.getAno()+"\nIdade: "+ heart.Idade(heart.getAno(), anoAtual, mesAtual, diaAtual)+"\nFrequência Cardíaca Máxima: "+
		heart.CalculoMaxima(heart.Idade(heart.getAno(), anoAtual, mesAtual, diaAtual)));
		System.out.printf("\nFrequência CardÍaca Alvo: %.0f",heart.Alvo1(heart.CalculoMaxima(heart.Idade(heart.getAno(), anoAtual, mesAtual, diaAtual))));
		
		System.out.printf(" Até %.0f",heart.Alvo2(heart.CalculoMaxima(heart.Idade(heart.getAno(), anoAtual, mesAtual, diaAtual))));
		scan.close();
	}


}
