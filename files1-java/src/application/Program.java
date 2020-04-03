package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		teste5();
	}
	
	public static void teste5() {	
		
		String[] lines = new String[] {"Bom Dia!", "Boa Tarde!", "Boa Noite", "Conforma a ocasião"};
		String path = "G:\\PROGRAMACAO\\JavaEE\\teste5.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			bw.newLine();
			for (String line : lines) {				
				bw.write(line);
				bw.newLine();
			}
		}catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public static void teste4() {
		String path = "G:\\PROGRAMACAO\\JavaEE\\lala.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {						
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void teste3() {
		String path = "G:\\PROGRAMACAO\\JavaEE\\lala.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	public static void teste2() {
		File file = new File("G:\\PROGRAMACAO\\JavaEE\\lala.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch(IOException e) {
			System.out.println("Error " + e.getMessage());
			
		}finally {
			System.out.println("Finally'");
			if(sc != null) {
				sc.close();
			}
		}
	}
	
	public static void teste1() {
		Scanner sc = new Scanner(System.in);
		
		//G:\PROGRAMACAO\JavaEE\lala.txt
		//File file = new File(sc.nextLine());
		File file = new File("G:\\PROGRAMACAO\\JavaEE");
		
		System.out.println(file.getAbsolutePath());
		//System.out.println();
		
		String[] files = file.list();
		
		for(String path : files) {
			System.out.println(path);
		}
		
		sc.close();
	}
	
	public static void originalProgram(){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();

		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			String itemCsv = br.readLine();
			while (itemCsv != null) {

				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				list.add(new Product(name, price, quantity));

				itemCsv = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

				for (Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}

				System.out.println(targetFileStr + " CREATED!");
				
			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		sc.close();
	}
}
