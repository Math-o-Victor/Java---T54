package br.com.generation.lacosDecisao;

import javax.swing.JOptionPane;

public class ExercicioLacoDecisao2 {
	
public static void main(String[] args) {
	
	double A,B,C;
	
	A = Integer.parseInt(JOptionPane.showInputDialog("Ol�! \nDigite o 1� n�mero:"));
	B = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2� n�mero:"));
	C = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3� n�mero:"));
	
	
	
	if (A>B && B>C) {
		JOptionPane.showMessageDialog(null, "Os valores do maior ao menor s�o:\n" + A + "\n" + B + "\n" + C);
	} else if (C>B && B>A) {
		JOptionPane.showMessageDialog(null, "Os valores do maior ao menor s�o:\n" + C + "\n" + B + "\n" + A);
	} else if (C>A && A>B) {
		JOptionPane.showMessageDialog(null, "Os valores do maior ao menor s�o:\n" + C + "\n" + A + "\n" + B);
	} else if (B>A && A>C) {
		JOptionPane.showMessageDialog(null, "Os valores do maior ao menor s�o:\n" + B + "\n" + A + "\n" + C);
	} else if (A>C && C>B) {
		JOptionPane.showMessageDialog(null, "Os valores do maior ao menor s�o:\n" + A + "\n" + C + "\n" + B);
	} else if (B>C && C>A) {
		JOptionPane.showMessageDialog(null, "Os valores do maior ao menor s�o:\n" + B + "\n" + C + "\n" + A);
	}
	
}
}
