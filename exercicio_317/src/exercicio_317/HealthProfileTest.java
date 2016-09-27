package exercicio_317;

import java.util.Scanner;

public class HealthProfileTest {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = scan.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = scan.nextLine();
		
		System.out.print("Digite seu sexo: ");
		String sexo = scan.nextLine();
		
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
		
		System.out.print("Digite sua altura em polegadas: ");
		double altura = scan.nextDouble();
		
		System.out.print("Digite seu peso em libras: ");
		double peso = scan.nextDouble();
		
		HealthProfile healt = new HealthProfile(nome, sobrenome, mes, dia, ano, altura, peso, sexo);
		System.out.printf("\nNome: "+healt.getNome()+"\nSobrenome: "+healt.getSobrenome()+"\nIdade: "+healt.Idade(ano, anoAtual, mesAtual, diaAtual)+"\nSexo: "+healt.getSexo()
		+"\nData de nascimento: "+healt.getMes()+"/"+healt.getDia()+"/"+healt.getAno());
		
		System.out.printf("\nAltura: %.2f",healt.getAltura());
		System.out.printf(" polegadas."+"\nPeso: %.2f",healt.getPeso());
		System.out.print(" libras.");
		
		System.out.printf("\nFrequencia Cardiaca Maxima: "+healt.CalculoMaxima(healt.Idade(ano, anoAtual, mesAtual, diaAtual))
		+"\nFrequencia Cardiaca Alvo: %.0f",healt.Alvo1(healt.CalculoMaxima(healt.Idade(ano, anoAtual, mesAtual, diaAtual))));
		
		System.out.printf(" até %.0f",healt.Alvo2(healt.CalculoMaxima(healt.Idade(ano, anoAtual, mesAtual, diaAtual))));
		healt.IMC(peso, altura);
		scan.close();
	}
}
