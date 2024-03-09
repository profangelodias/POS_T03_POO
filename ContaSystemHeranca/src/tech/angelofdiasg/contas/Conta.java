package tech.angelofdiasg.contas;

public class Conta {
	//Variáveis / Estados
	int numero;
	double saldo;
	
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
	
	//Métodos / Comportamentos
	boolean sacar(double val) {
		//Lógica para retornar booleano caso o saque
		//aconteça
		if(this.saldo >= val) {
			this.saldo = this.saldo - val;
			return true;
		} else {
			//Lógica para retornar booleano caso o saque
			//NÃO aconteça
			System.out.println("Não tem saldo suficiente!");
			return false;
		}
	}
	
	boolean depositar(double val) {
		if(val < 0) {
			return false;
		} else {
			this.saldo = this.saldo + val;
			return true;
		}
	}
	
	//Retorna o saldo do objeto (Conta)
	double getSaldo(){
		return this.saldo;
	}

}
