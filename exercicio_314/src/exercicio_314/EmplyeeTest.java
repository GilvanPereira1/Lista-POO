package exercicio_314;

public class EmplyeeTest {
	
public static void main(String[] args){
		
		
		
		Employee a = new Employee("Maria", "José", 3500);
		System.out.println("Objeto 1:\nNome: "+ a.getNome() +"\nSobrenome: " + a.getSobrenome() +"\nSalario anual: "+  a.getSalarioMensal()*12);
		
		Employee b = new Employee("José", "Maria", 3500);
		System.out.println("\nObjeto 2:\nNome: "+ b.getNome() +"\nSobrenome: " + b.getSobrenome() +"\nSalario anual: "+  b.getSalarioMensal()*12);
	
		double objeto1 = 0.10 * (a.getSalarioMensal()*12);
		objeto1 += (a.getSalarioMensal()*12);
		
		double objeto2 = 0.10 * (b.getSalarioMensal()*12);
		objeto2 += (b.getSalarioMensal()*12);
		
		
		
		System.out.println("\nObjeto 1 com acréscimo de 10%:\nNome: "+ a.getNome() +"\nSobrenome: " + a.getSobrenome() +"\nSalario anual: "+ objeto1 );
		System.out.println("\nObjeto 2 com acréscimo de 10%:\nNome: "+ b.getNome() +"\nSobrenome: " + b.getSobrenome() +"\nSalario anual: "+ objeto2 );
	}

}
