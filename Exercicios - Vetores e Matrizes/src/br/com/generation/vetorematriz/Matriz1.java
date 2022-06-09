package br.com.generation.vetorematriz;
import java.util.Scanner;
public class Matriz1 {

	public static void main(String[] args) {
		
		int[][] n1 = new int[4][6];
		int[][] n2 = new int[4][6];
		int[][] m1 = new int[4][6];
		int[][] m2 = new int[4][6];
	
		
		Scanner li = new Scanner(System.in);
		
		for(int l = 0; l < n1.length; l++) {
			for(int c = 0; c < n1[l].length; c++) {
				System.out.println("Digite o valor da linha " + (l+1) + " e da coluna " + (c+1 + " da matriz N1."));
				n1[l][c] = li.nextInt();
				}
		}
		for(int l = 0; l < n2.length; l++) {
			for(int c = 0; c < n2[l].length; c++) {
				System.out.println("Digite o valor da linha " + (l+1) + " e da coluna " + (c+1 + " da matriz N2."));
				n2[l][c] = li.nextInt();
			}
		}
		for(int l = 0 ; l < m1.length; l++) {
			for(int c = 0 ; c< m1[l].length; c++) {
				m1[l][c] = n1[l][c] + n2[l][c];
			}
		}
		for(int l = 0 ; l < m2.length; l++) {
			for(int c = 0 ; c < m2[l].length; c++) {
				m2[l][c] = n1[l][c] - n2[l][c];
			}
		}
		System.out.println();
		System.out.println("Valor da soma dos valores na mesma posição:\n");
		for(int l = 0 ; l < m1.length; l++) {
			for(int c = 0 ; c< m1[l].length; c++) {
				System.out.printf(m1[l][c] + " | ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Diferença entre valores da mesma posição:\n");
		for(int l = 0 ; l < m2.length; l++) {
			for(int c = 0 ; c< m2[l].length; c++) {
				System.out.printf(m2[l][c] + " | ");
			}
			System.out.println();
		}
		li.close();
}
}