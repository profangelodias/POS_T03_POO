package tech.angelofdiasg.contas;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Criar uma conta
		Conta conta1 = new Conta();
		Conta conta2 = new Conta(2, 2);
		Conta conta3 = new Conta(3);
		
		ContaEspecial cEspc1 = new ContaEspecial();
		ContaEspecial cEspc2 = new ContaEspecial(02, 12000, 100000);
		
		System.out.println("Saldo da conta 1: " + conta1.saldo);
		System.out.println("Saldo da conta especial: " + cEspc2.saldo);
		System.out.println("Limite da conta especial: " + cEspc2.limite);
		
		//Atribui valores aos estados
//		conta1.numero = 1;
//		conta1.saldo = 1;
//		//Depositar e imprimir saldo
//		System.out.println("Infomre o valor para deposito inicial: ");
//		if(conta1.depositar(leitor.nextDouble())) {
//			System.out.println("Seu saldo inicial é: ");	
//			System.out.println(conta1.getSaldo());
//		} else {
//			System.out.println("Valor precisa ser maior que zero!");
//		}
//		
//		//Sacar e imprimir o saldo
//		System.out.println("Infomre o valor para sacar: ");
//		if(conta1.sacar(leitor.nextDouble())) {
//			System.out.println("Seu saldo atual é: ");
//			System.out.println(conta1.getSaldo());
//		} else {
//			System.out.println("Não tem saldo!");
//		}
		
	}

}
