package br.com.generation.POO;

public class Paciente {
	
	private String nome;
	private int idade;
	private double temp;
	private String dor;
	private boolean melhor;
	private String receita;
	
	public String getReceita() {
		return receita;
	}
	public void setReceita(String receita) {
		this.receita = receita;
	}
	public boolean isMelhor() {
		return melhor;
	}
	public void setMelhor(boolean melhor) {
		this.melhor = melhor;
	}
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
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public String getDor() {
		return dor;
	}
	public void setDor(String dor) {
		this.dor = dor;
	}
	
	public void espera() {
		System.out.println("Paciente esperando ser chamado...");
	}
	
	public void curado() {
		if (melhor == true) {
			System.out.println("Paciente melhor. Liberado para ir para casa.");
		} else if (melhor == false){
			System.out.println("Paciente com mal estar. Direciona-lo para observação");
		}
	}
	
	public void showPaciente() {
		System.out.println("Nome: "+ nome+"\nIdade: "+idade+"\nQueixa: " + dor +"\nTemperatura: "+temp+"\nPaciente melhor? "+melhor);
	}
	
	

}
