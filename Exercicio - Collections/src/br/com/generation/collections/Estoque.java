package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
	
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList <String> estoque = new ArrayList();
	
	static int i = 0, opt;
	
	static String addNome;

	public static void main(String[] args) {

		
		
		System.out.println("Bem vindo ao menu do 'Nosso Prato'");
		System.out.println("---------------------------------");
		
		estoque.add("Prato Feito");
		estoque.add("Marmita");
		estoque.add("Stronoff");
		estoque.add("Frango Empanado");
		
		
		for(i=0;i<estoque.size();i++) {
			System.out.println("Pagina " + i + " | " + estoque.get(i));
		}
		
		
		
		do {
			System.out.println("---------------------------------");
			System.out.println("O que você gostaria de fazer?"
					+ "\n\n(1) Adicionar um prato novo"
					+ "\n(2) Remover um prato"
					+ "\n(3) Trocar um prato"
					+ "\n(4) Sair");
			opt = sc.nextInt();
			
			switch (opt) {
			case 1:
				addPrato();
				break;
			case 2:
				remPrato();
				break;
			case 3:
				setPrato();
				break;
			}
		} while (opt != 4);
		
		System.out.println("Seu novo menu final é:");
		System.out.println("---------------------------------");
		
		for(i=0;i<estoque.size();i++) {
			System.out.println("Pagina " + i + " | " + estoque.get(i));
		}
		
		sc.close();
		
		}
		
		public static void remPrato() {
			System.out.println("Qual pagina vai ser excluida?");
			i=sc.nextInt();
			
			estoque.remove(i);
			System.out.println();
			
			System.out.println("Seu novo menu é:");
			System.out.println("---------------------------------");
			for(i=0;i<estoque.size();i++) {
				System.out.println("Pagina " + i + " | " + estoque.get(i));
			}
		}
		
		public static void addPrato() {
			System.out.println("Digite o nome do prato:");
			addNome = sc.next();
			
			estoque.add(addNome);
			
			System.out.println();
			System.out.println("Seu novo menu é:");
			System.out.println("---------------------------------");
			for(i=0;i<estoque.size();i++) {
				System.out.println("Pagina " + i + " | " + estoque.get(i));
			}
		}
		
		public static void setPrato() {
			System.out.println("Qual prato você gostaria de trocar?");
			i= sc.nextInt();
			System.out.println("Qual o novo prato?");
			addNome = sc.next();
				
			estoque.set(i, addNome);
			
			System.out.println();
			System.out.println("Seu novo menu é:");
			System.out.println("---------------------------------");
			for(i=0;i<estoque.size();i++) {
				System.out.println("Pagina " + i + " | " + estoque.get(i));
			}
		}
}


