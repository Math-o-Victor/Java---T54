package br.com.generation.lacosDecisao;

import javax.swing.JOptionPane;

public class ExercicioLacoDecisao1 {

	public static void main(String[] args) {
		int numA,numB, numC;
		numA = Integer.parseInt(JOptionPane.showInputDialog("Olá! \nDigite o 1º número:"));
		numB = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número:"));
		numC = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º número:"));

		if (numA>numB && numA>numC) {
			JOptionPane.showMessageDialog(null, "O 1º número é o maior.");
		}
		if (numB>numA && numB>numC) {
			JOptionPane.showMessageDialog(null, "O 2º número é o maior.");
		}
		if (numC>numB && numC>numA) {
			JOptionPane.showMessageDialog(null, "O 3º número é o maior.");
		}
	}

}
