package entities;

public class Conta { 
	//ATRIBUTOS DO OBJETO CONTA
	private int numConta;
	private String nomeTitular;
	private double saldo;
	
	//MÉTODOS	
	public void Deposito(double montante) {
		saldo += montante;
	} //SOMA O DEPÓSITO AO SALDO DA CONTA
	
	public void Saque (double montante) {
		saldo -= montante + 5;
	} //DIMINUI O SAQUE COM TAXA DE R$ 5,00 DO SALDO DA CONTA
	
	
	//CONSTRUTOR E SOBRECARGA
	public Conta(int numConta, String nomeTitular, double depositoInicial) { //TORNAM OBRIGATÓRIOS OS 3 CAMPOS
		this.numConta = numConta; 
		this.nomeTitular = nomeTitular;
		Deposito(depositoInicial); //CARREGA O MÉTODO DE DEPÓSITO 
	}
	
	public Conta(int numConta, String nomeTitular) { //TORNAM OBRIGATÓRIOS OS 2 CAMPOS
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
	
	// CONVERSÃO DE OBJETO PARA STRING
	public String toString () {
		return "\nSITUAÇÃO DA CONTA "
				+ numConta
				+ "\nTITULAR: "
				+ nomeTitular
				+ "\nSALDO: "
				+ String.format("%.2f%n", saldo);
				
	}
	
	
	
	
	
	
}
