package br.com.generation.lacosrepeat;
import javax.swing.JOptionPane;

public class ExercRepeat4 {

	
	public static void main(String[] args) {
		
		int idade=0, sexo=0, temp=0, pessoas=0;
		int calmos=0, mBra=0, hTox=0, gCalm=0, vBrab=0,jCalm=0;
		
		
			
		
			
				while ( idade != 404 || sexo != 404 || temp != 404) {				
				idade = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite a idade da " + (pessoas+1) + "ª pessoa. \nPara sair digite 404 e pressione enter."));
				sexo = Integer.parseInt(JOptionPane.showInputDialog("Agora o sexo: \nPor favor, digite:\n\n(1) Feminino \n(2) Masculino \n(3) Outros\nPara sair digite 404 e pressione enter."));
				temp = Integer.parseInt(JOptionPane.showInputDialog("Por ultimo o temperamento \nPor favor, digite: \n\n(1) Se a pessoa era calma \n(2) Se a pessoa era nervosa \n(3) Se a pessoa era agressiva."));
				if (temp == 1) {
					calmos++;
				}
				if (sexo==1 && temp == 2) {
					mBra++;	
				}
				if (idade <= 17 && temp == 1) {
					jCalm++;
				}
				if (sexo == 3 && temp == 1) {
					gCalm++;
				}
				if (sexo == 2 && temp ==3) {
					hTox++;
				}
				if (idade >=40 && temp == 2) {
					vBrab++;
				} 
							
		}

	}
		JOptionPane.showMessageDialog(null, "Houveram: \n" + calmos + " Pessoas calmas\n" + mBra + " Mulheres nervosas\n" + hTox + " Homens agressivos\n" + gCalm + " Outros calmos\n" + vBrab + "Pessoas de 40 anos ou mais nervosas" + jCalm + "Pessoas com 17 anos ou menos calmas");
		JOptionPane.showMessageDialog(null, "Obrigado por utilizar nossos serviços!");
}
