import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		int num, hora, min, seg;
		System.out.println("Fábrica Ficticia");
		System.out.println("---------------------++---------------------");
		System.out.println("Digite o numero de segundos: ");
		Scanner leia = new Scanner (System.in);
		num = leia.nextInt();
		
		min = num/60;
		hora = min/60;
		seg = num % 60;
		
		if (min >= 60) {
			hora = min/60;
			min = min % 60;
		}
		if (seg >= 60) {
			min = min + (seg/60);
			seg = 0;
		}
		
		if (seg < 10 ) {
			System.out.println("Seus " + num + "segundos são: " + hora + " horas, " + min + " Minutos e 0" + seg + " segundos.");
		}
		if (seg >= 10) {
			System.out.println("Seus " + num + "segundos são: " + hora + " horas, " + min + " Minutos e " + seg + " segundos.");
		}
		
		leia.close();
		
	}

	}
	
