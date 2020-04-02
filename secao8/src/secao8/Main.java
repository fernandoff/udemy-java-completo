package secao8;

import java.util.Locale; 
import java.util.Scanner;
import entities.Triangle;

public class Main {
	
	public static void main(String[] args) { 
		//pooSolution();
		testeToString();
	}	
	
	public static void testeToString() {
		Triangle a = new Triangle(10,10,10);
		System.out.println(a);
	}	
	
	public static void pooSolution() { 
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
			
		// Le dados do primeiro triangulo
		System.out.println("Enter the measures of triangle X: "); 
		x.a = sc.nextDouble(); 
		x.b = sc.nextDouble(); 
		x.c = sc.nextDouble(); 
		
		// Le dados do segundo triangulo
		System.out.println("Enter the measures of triangle Y: "); 
		y.a = sc.nextDouble(); 
		y.b = sc.nextDouble(); 
		y.c = sc.nextDouble();	
				
		// Calcula area de cada triangulo
		double areaX = x.area();
		double areaY = y.area();
		
		// Exibe as areas de cada triangulo
		System.out.printf("Triangle X area: %.4f%n", areaX); 
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		// Compara qual o maior e exibe na tela
		if (areaX > areaY) { 
			System.out.println("Larger area: X"); 
		} else { 
			System.out.println("Larger area: Y"); 
		}
		sc.close();
		
	}
	
	public static void oldSoution() {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		System.out.println("Enter the measures of triangle X: "); 
		xA = sc.nextDouble(); 
		xB = sc.nextDouble(); 
		xC = sc.nextDouble(); 
		System.out.println("Enter the measures of triangle Y: "); 
		yA = sc.nextDouble(); 
		yB = sc.nextDouble(); 
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0; 
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		p = (yA + yB + yC) / 2.0; 
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		System.out.printf("Triangle X area: %.4f%n", areaX); 
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) { 
			System.out.println("Larger area: X"); 
		} else { 
			System.out.println("Larger area: Y"); 
		}
		sc.close();
	}
}