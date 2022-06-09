package br.com.generation.vetorematriz;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		
		int soma=0,media=0, maior=0,vzx=0;
		int[] lance = new int[10];
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Olá!");
		
		for (int i=0 ; i < lance.length ; i++) {
			System.out.println("Digite o valor do " + (i+1) + "º lançamento");
			lance[i] = leia.nextInt();
			soma += lance[i];
			media = soma/lance.length;
			if (lance[i]>maior) {
				maior = lance[i];
			}
			
			
		}
		for (int i = 0 ; i < lance.length; i++) {
			if (lance[i] == maior) {
				vzx++;
			}
		}
		System.out.println("\n\nA média foi: " + media + "\n");
		System.out.println("O maior numero foi " + maior + ", e ele apareceu " + vzx + " vezes.");
		leia.close();
	}

}
