package br.com.generation.lacosrepeat;
import java.util.Locale;
public class ExercRepeat1 {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("pt", "BR"));
		int start = 1000, i;
		System.out.println("Os n�meros que s�o divisiveis por 11, com resto 5, entre 1000 e 1999 s�o:");
		for (start=1000;start <=1999; start++) { //Comece no 1000 e pare em 1999
			i=start % 11;// o i � igual ao resto da divis�o entre start e 11
			if (i == 5) {// se o i for 5
				System.out.println(start);// escreva o numero equivalente a start
			}
			}
		}
		

	}

