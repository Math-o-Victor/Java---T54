package br.com.generation.POO;

import java.util.Scanner;

public class Cliente {
	
	
	Scanner leitor = new Scanner(System.in);
	
	//Nome do Cliente
	private String nome;
	//Idade do Cliente
	private int idade;
	//Ticket médio do Cliente
	private int ticket, compra, soma, cont=0;
	//Informação de contato do Cliente
	private String contato = "Sem contato", tipoDeContato = "Sem contato";
	
		
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getTicket() {
		return ticket;
	}


	public void setTicket(int ticket) {
		this.ticket = ticket;
	}


	public int getCompra() {
		return compra;
	}


	public void setCompra(int compra) {
		this.compra = compra;
	}


	public int getSoma() {
		return soma;
	}


	public void setSoma(int soma) {
		this.soma = soma;
	}


	public String getContato() {
		return contato;
	}


	public void setContato(String contato) {
		this.contato = contato;
	}


	public String getTipoDeContato() {
		return tipoDeContato;
	}


	public void setTipoDeContato(String tipoDeContato) {
		this.tipoDeContato = tipoDeContato;
	}


		
	void novaCompra() {
		System.out.println("Por favor, digite o valor da compra:\n");
		cont++;
		compra = leitor.nextInt();
		soma = compra + soma;
		ticket = soma/cont;
		System.out.print("O valor do seu ticket médio atual é de: R$" + ticket + "\n");
		System.out.println();
		}
		

	
	
	void contato() {
		System.out.println("Seu celular tem Whatsapp?\n");
		tipoDeContato = leitor.next();
		System.out.println("Digite o numero de contato:\n");
		contato = leitor.next();
	}
	
	void showClient(){
		System.out.print("Nome: " + nome 
				+ "\nIdade: " + idade 
				+ "\nContato: " + contato 
				+ "\nWhatsapp: " + tipoDeContato 
				+ "\nTicket Médio: R$" + ticket);
	}
	
	
}