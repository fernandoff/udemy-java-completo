

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		basicCommands();
		//stringFunctions();
	}
	
	public static void lixo() {
				
	}
	
	public static void stringFunctions() 
	{
		System.out.println("\n ------ Metodo teste ----- \n");
		String teste;
		teste = "0123456789";
		System.out.println(teste.substring(0,6));
		System.out.println(teste.substring(7,9));
		
		teste = "Semana que vem";
		String[] vet = teste.split(" ");
		System.out.println( Arrays.asList(vet).contains("Semana"));
	}
	
	public static void basicCommands() 
	{
		int idade = 25;
		double salario = 3500.45;
		char sexo = 'M';
		String nome = "motherfucker";		

		System.out.println("sua idade eh " + idade);
		System.out.println("seu nome eh " + nome);
		System.out.println("seu seco eh " + sexo);
		System.out.println("seu sal�rio eh " + salario);
		
		System.out.println("Salario no Brasil");
		System.out.printf("%.2f%n", salario);
		System.out.println("Salario no US");
		//Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", salario);
		
		// String formatada
		System.out.printf("\n %s: \n sua idade �: \n %d e seu salario �: \n %.2f", nome, idade, salario);
		
		// --------------- CASTING ------------
		System.out.println("\n\n-------- CASTING -------- ");
		int a, b;
		a = 5;
		b = 2;
		System.out.println(a / b);
		System.out.println( (double) a / b );
		
		// --------------- INPUT ------------
		sexo = 'K';
		if(sexo == 'K') {
			System.out.println("\n\n-------- INPUT -------- ");
			
			Scanner sc = new Scanner(System.in);
			String input;		
			
			System.out.println("Digite seu nome");
			input = sc.next();
			System.out.println("Seu nome �: " + input);
			
			System.out.println("Digite sua idade");
			idade = sc.nextInt();		
			System.out.println("sua idade �: " + idade);		
			
			System.out.println("Digite seu sal�rio pretendido");		
			salario = sc.nextDouble();
			System.out.println("Seu sal�rio pretendido �: " + salario);
			
			System.out.println("Digite seu sexo");
			sexo = sc.next().charAt(0);
			System.out.println("Seu sexo � " + sexo);		
			
			// Ler varios dados at� a quebra da linha
			String s1, s2, s3;
			
			s1 = sc.nextLine();
			s2= sc.nextLine();
			s3 = sc.nextLine();
			
			System.out.println("Dados Digitados");
			System.out.printf("%s %s %s", s1, s2, s3);
			
			sc.close();
		}
		
		

	}
		

}
