package br.com.generation.lacosdecisao;
import javax.swing.JOptionPane;
public class ExercicioLacoDecisao3 {
	
	public static void main(String[] args) {
		
		int idade;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));
		
		if (idade>=10 && idade<=14) {
			JOptionPane.showMessageDialog(null, "Sua categoria � Infantil! \nEntre 10 e 14 anos.");
		} else if (idade>=15 && idade<=17) {
			JOptionPane.showMessageDialog(null, "Sua categoria � Juvenil! \nEntre 15 e 17 anos.");
		} else if (idade>=18 && idade<=25) {
			JOptionPane.showMessageDialog(null, "Sua categoria � Adulto! \nEntre 18 e 25 anos.");
		} else {
			JOptionPane.showMessageDialog(null, "N�o trabalhamos com sua faixa et�ria no momento. \nAssine a nossa newsletter para saber quando aulas para seu grupo et�rio estar�o disponiveis.");
		}
	}

}
