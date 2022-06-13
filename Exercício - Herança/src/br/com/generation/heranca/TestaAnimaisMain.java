package br.com.generation.heranca;

public class TestaAnimaisMain {

	public static void main(String[] args) {
		
		Preguica lazy1 = new Preguica();
		Cavalo horse1 = new Cavalo();
		Cachorro dog1 = new Cachorro();
		
		dog1.setNome("Coragem");
		dog1.setIdade(4);
		dog1.setSom(true);
		dog1.setCorre(true);
		
		System.out.println("Nome do Cachorro 1: " + dog1.getNome());
		System.out.println("Idade do Cachorro 1: " + dog1.getIdade());
		System.out.println("Produz som? " + dog1.isSom());
		System.out.println("Corredor? " + dog1.isCorre());
		System.out.println();
		
		horse1.setNome("Alipio");
		horse1.setIdade(8);
		horse1.setSom(true);
		horse1.setCorre(true);
		
		System.out.println("Nome do Cavalo 1: " + horse1.getNome());
		System.out.println("Idade do Cavalo 1: " + horse1.getIdade());
		System.out.println("Produz som? " + horse1.isSom());
		System.out.println("Corredor? " + horse1.isCorre());
		System.out.println();
		
		lazy1.setNome("Matheus");
		lazy1.setIdade(23);
		lazy1.setSom(true);
		lazy1.setEscala(true);
		
		System.out.println("Nome da Pregiça 1: " + lazy1.getNome());
		System.out.println("Idade da Preguiça 1: " + lazy1.getIdade());
		System.out.println("Produz som? " + lazy1.isSom());
		System.out.println("Escalador? " + lazy1.isEscala());
		System.out.println();
		
	}

}
