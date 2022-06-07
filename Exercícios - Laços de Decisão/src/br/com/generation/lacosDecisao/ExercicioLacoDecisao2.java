package br.com.generation.lacosDecisao;

import javax.swing.JOptionPane;

public class ExercicioLacoDecisao2 {
	
public static void main(String[] args) {
	
	double A,B,C;
	
	A = Integer.parseInt(JOptionPane.showInputDialog("Olá! \nDigite o 1º número:"));
	B = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número:"));
	C = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º número:"));
	
	
	
	if (A>B && B>C) {
		JOptionPane.showMessageDialog(null, "Os valores do maior ao menor são:\n" + A + "\n" + B + "\n" + C);
	} else if (C>B && B>A) {
		JOptionPane.showMessageDialog(null, "Os valores do maior ao menor são:\n" + C + "\n" + B + "\n" + A);
	} else if (C>A && A>B) {
		JOptionPane.showMessageDialog(null, "Os valores do maior ao menor são:\n" + C + "\n" + A + "\n" + B);
	} else if (B>A && A>C) {
		JOptionPane.showMessageDialog(null, "Os valores do maior ao menor são:\n" + B + "\n" + A + "\n" + C);
	} else if (A>C && C>B) {
		JOptionPane.showMessageDialog(null, "Os valores do maior ao menor são:\n" + A + "\n" + C + "\n" + B);
	} else if (B>C && C>A) {
		JOptionPane.showMessageDialog(null, "Os valores do maior ao menor são:\n" + B + "\n" + C + "\n" + A);
	}
	
}
}
