package br.com.generation.lacosDecisao;

import javax.swing.JOptionPane;

public class ExercicioLacoDecisao1 {

	public static void main(String[] args) {
		int numA,numB, numC;
		numA = Integer.parseInt(JOptionPane.showInputDialog("Ol�! \nDigite o 1� n�mero:"));
		numB = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2� n�mero:"));
		numC = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3� n�mero:"));

		if (numA>numB && numA>numC) {
			JOptionPane.showMessageDialog(null, "O 1� n�mero � o maior.");
		}
		if (numB>numA && numB>numC) {
			JOptionPane.showMessageDialog(null, "O 2� n�mero � o maior.");
		}
		if (numC>numB && numC>numA) {
			JOptionPane.showMessageDialog(null, "O 3� n�mero � o maior.");
		}
	}

}
