package tech.angelofdiasg.contas;

import java.util.Random;

public class Conta {
	//Variáveis / Estados
	private int numero;
	private double saldo;
	
	//Criando construtores
	public Conta() {
		System.out.println("A conta vazia foi criada!");
	}
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	public Conta(int numero) {
		this.numero = numero;
		this.saldo = 1;
		System.out.println("Seu saldo inicial é: R$" 
		+ this.saldo + " " + "na sua conta de número: " 
				+ this.numero);
	}
	
	public Conta(double valDeposito) {
		depositar(valDeposito);
		//Lógica de número automático
		// criar um objeto da classe Random
        Random random = new Random();
        // gerar um número aleatório de 0.0 até 0.99...
        this.numero = random.nextInt();
	}
	//Métodos / Comportamentos
	public boolean sacar(double valor) {
		//Lógica para retornar booleano caso o saque
		//aconteça
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			//Lógica para retornar booleano caso o saque
			//NÃO aconteça
			System.out.println("Não tem saldo suficiente!");
			return false;
		}
	}
	
	public boolean depositar(double val) {
		if(val < 0) {
			return false;
		} else {
			this.saldo = this.saldo + val;
			return true;
		}
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double novoSaldo) {
		this.saldo = novoSaldo;
	}
	
	//Retorna os estados do objeto (Conta)
	
}
