package br.com.generation.POO;

import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {
		
		
		Cliente c1 = new Cliente();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Por favor digite o seu nome: ");
		c1.setNome(sc.next());
		System.out.println(c1.getNome() + ", por favor digite a sua idade:");
		c1.setIdade(sc.nextInt());
		
		c1.contato();
	
		c1.novaCompra();
		
		c1.showClient();
		
		sc.close();
	}

}
