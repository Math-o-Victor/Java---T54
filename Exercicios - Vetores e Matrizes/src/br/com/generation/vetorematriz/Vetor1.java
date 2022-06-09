package br.com.generation.vetorematriz;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		
		Scanner l = new Scanner (System.in);
		
		int[] vet = new int[5], maior = new int [1];
		
		System.out.println("Olá!");
		
		for (int i=0 ; i < vet.length ; i++) {
			System.out.printf("Por favor, digite o numero da " + (i+1) + "ª nota.");
			vet[i]=l.nextInt();
			if (maior[0] <= vet[i]) {
				maior[0] = vet[i];
			}
			
		}
		System.out.println("\nSuas notas foram:");
		System.out.printf("Notas: ");
		for (int i=0 ; i<vet.length ; i++) {
		System.out.printf(vet[i] + " | ");
		
		}
		System.out.println("\n\nSua maior nota foi: "+ maior[0]);
		l.close();
	}

}


