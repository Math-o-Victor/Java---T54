package br.com.generation.lacosdecisao;
import javax.swing.JOptionPane;
public class ExercicioLacoDecisao4 {
	public static void main(String[] args) {
		
		double num, num1;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		 if (num % 2 == 0) 
		 	{
			 num1 = Math.sqrt(num);
			 JOptionPane.showMessageDialog(null,"O numero informado é par, e a sua raiz é " + num1);
			} else 
			{
				num1 = Math.pow(num,2);
				JOptionPane.showMessageDialog(null,"O numero informado é impar, e seu quadrado é " + num1);
			}
}
}
