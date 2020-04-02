package secao10_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		//listas();		
		matriz();
	}
	
	public static void matriz() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero total de lados");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i = 0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				System.out.println("Informe o numero");
				mat[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
	}
	
	public static void listas() {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Jhon");
		list.add("Maickel");		
		list.add(0, "lol");
		
		System.out.println("----- FULL LIST -----");
		for (String nome : list) {
			System.out.println(nome);
		}
	
		list.removeIf(nome -> nome.charAt(0) != 'M');
		
		System.out.print("------ LIST WITH THE M's -------");
		System.out.println(" Total = " + list.size());
		for (String nome : list) {
			System.out.println(nome);
		}
		
		System.out.println("--------------------");
		System.out.printf("Index of lol = %s \n", list.indexOf("lol"));
		System.out.printf("Index of Marco = %s \n", list.indexOf("Marco"));
		
		System.out.println("------- LIST WITH 3 R ----------");
		
		List<String> result = 
				list
				.stream()
				.filter(nome -> nome.charAt(2) == 'r')
				.collect(Collectors.toList());
		
		for (String nome : result) {
			System.out.println(nome);
		}
		
		list.add("awesome");
		System.out.println("------  FIND FIRST ---- ");
		for (String nome : list) {
			System.out.println(nome);
		}
		
		String name = list.stream().filter(nome -> nome.charAt(0) == 'a').findFirst().orElse(null);
		System.out.println("(find first) Nome = " + name);

	}

}
