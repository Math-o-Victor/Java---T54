package br.com.generation.POO;

import java.util.Scanner;

public class TestaPaciente {
	
		public static void main(String[] args) throws InterruptedException {

		int melhor;
		Scanner s1 = new Scanner (System.in);
		Paciente p1 = new Paciente();
				p1.espera();
		Thread.sleep(3000);
		
		System.out.println("Digite o nome do paciente: ");
		p1.setNome(s1.next());
		System.out.println("Digite a idade do paciente: ");
		p1.setIdade(s1.nextInt());
		System.out.println("Aonde o paciente se queixa da dor?");
		p1.setDor(s1.next());
		System.out.println("E qual a sua temperatura? (Em graus cesius, por favor digite apenas os numeros)");
		p1.setTemp(s1.nextDouble());
		System.out.println("Qual a receita para o paciente?");
		p1.setReceita(s1.next());
		System.out.println("O paciente já se sente melhor? \nDigite '1' para sim e '2' para não");
		melhor = s1.nextInt();
		if (melhor == 1) {
		p1.setMelhor(true);
		} else {
		p1.setMelhor(false);
		}
				
		p1.showPaciente();
		p1.curado();
		
		s1.close();
	}

}
