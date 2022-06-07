import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int dia,mes,ano, meses, anos, dias;
		
		System.out.println("Digite o dia do seu nascimento: ");
	
		dia = leia.nextInt();
		
		System.out.println("Digite o mês do seu nascimento: ");

		mes = leia.nextInt();
		
		System.out.println("Digite o Ano do seu nascimento: ");

		ano = leia.nextInt();
		
		if (mes <= 6) {
			mes = 0;
		
		meses = (mes * 30)- 182;
		anos = (2022 - ano) * 365;
		dias = dia + anos + meses;
		System.out.println("Sua idade em dias são: " +  dias);	
		
		}
		
		
		
		
	}

}
