import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		
		int  ano, mes, dia;
		Scanner inp = new Scanner  (System.in);
		System.out.println("Digite o numero de dias: ");
		dia = inp.nextInt();
		ano = dia/365;
		mes = dia/30;
		
		System.out.println("Voc� viveu " + ano + " anos, " + mes + " meses e " + dia + " dias.");
				
	}
		
}
