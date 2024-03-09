package tech.angelofdiasg.contas;

public class ContaEspecial extends Conta{
	
	double limite;
	
	public ContaEspecial() {
		System.out.println("Conta especial vazia criada!");
	}
	public ContaEspecial(double limite) {
		super();
		this.limite = limite;
	}
	public ContaEspecial(int numero, double saldo, double limite) {
		super(numero, saldo);
		this.limite = limite;
	}
	
	boolean sacar(double val) {
		if(this.saldo >= val) {
			this.saldo = this.saldo - val;
			return true;
		} else {
			System.out.println("Não tem saldo suficiente!");
			return false;
		}
	}

}
