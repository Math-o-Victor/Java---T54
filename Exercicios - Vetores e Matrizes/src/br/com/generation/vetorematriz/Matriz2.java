package br.com.generation.vetorematriz;

import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Olá!");
		
		double diag=0;
		double [][] mtx = new double [3][3];
		double soma=0;
		
		for(int l = 0 ; l <=2; l++) {
			for(int c = 0 ; c<=2; c++) {
				System.out.println("Digite o " + (l+1) + "º numero da coluna " +(c+1)+ ".");
				mtx[l][c]=leia.nextDouble();
				soma += mtx[l][c];
				diag = mtx[0][0] + mtx[1][1] + mtx[2][2];
			}
			
			System.out.println();
		}
		
		System.out.println("Obrigado! \n\nA soma total dos valores é " + soma + "\n\nE a soma da diagonal principal é " + diag);
		
		leia.close();

	}

}
