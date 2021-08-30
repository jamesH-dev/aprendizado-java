package entities;

public class Conta { 
	//ATRIBUTOS DO OBJETO CONTA
	private int numConta;
	private String nomeTitular;
	private double saldo;
	
	//M�TODOS	
	public void Deposito(double montante) {
		saldo += montante;
	} //SOMA O DEP�SITO AO SALDO DA CONTA
	
	public void Saque (double montante) {
		saldo -= montante + 5;
	} //DIMINUI O SAQUE COM TAXA DE R$ 5,00 DO SALDO DA CONTA
	
	
	//CONSTRUTOR E SOBRECARGA
	public Conta(int numConta, String nomeTitular, double depositoInicial) { //TORNAM OBRIGAT�RIOS OS 3 CAMPOS
		this.numConta = numConta; 
		this.nomeTitular = nomeTitular;
		Deposito(depositoInicial); //CARREGA O M�TODO DE DEP�SITO 
	}
	
	public Conta(int numConta, String nomeTitular) { //TORNAM OBRIGAT�RIOS OS 2 CAMPOS
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}

	// GETS E SETS (ENCAPSULAMENTO)
	public int getNumConta() {
		return numConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	// CONVERS�O DE OBJETO PARA STRING
	public String toString () {
		return "\nSITUA��O DA CONTA "
				+ numConta
				+ "\nTITULAR: "
				+ nomeTitular
				+ "\nSALDO: "
				+ String.format("%.2f%n", saldo);
				
	}
	
	
	
	
	
	
}
