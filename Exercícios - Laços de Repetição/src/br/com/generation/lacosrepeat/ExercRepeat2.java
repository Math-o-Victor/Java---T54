package br.com.generation.lacosrepeat;
import javax.swing.JOptionPane;
public class ExercRepeat2 {
	
	public static void main(String[] args) {
		int num = 10, vet[] = new int [num],par=0, impar=0;
		
		for (int i = 0;i<num;i++) {
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite dez n�meros:"+ "\n" + (i+1) +"/ 10" ));
			if (vet[i]%2==0) {
				par++;
			}else {
				impar++;
			}
		}
		
		JOptionPane.showMessageDialog(null,"Voc� digitou " + par + " n�meros pares e " + impar + " n�meros impares");
		
		
		
	}

}
