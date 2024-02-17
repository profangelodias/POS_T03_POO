package tech.angelofdiasg.contas;

public class Conta {

	int numero;
	String nome;
	double saldo;
	double limite;

	void sacar(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}

}
