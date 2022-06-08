package br.com.generation.lacosrepeat;
import javax.swing.JOptionPane;
public class ExercRepeat3 {
	
	public static void main(String[] args) {
		
		int i=1, idadeSw=0, sub21=0,pls50=0;
		
		for (i=1; i!=-1;i++) {
			while(idadeSw != -99) {
			idadeSw = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de varias pessoas:\nPara concluir, digite: -99"));
			
			
			if (idadeSw <= 21) {
				sub21++;
			} else if (idadeSw >= 50) {
				pls50++;
			}
			
		}	
		}
		
		JOptionPane.showMessageDialog(null, "Total de pessoas com menos de 21 anos: " + sub21 + "\nTotal de pessoas com mais de 50: " + pls50);
	
	}

}
