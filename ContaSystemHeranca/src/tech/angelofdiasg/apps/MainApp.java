package tech.angelofdiasg.apps;

import java.util.Scanner;

import tech.angelofdiasg.contas.*;

public class MainApp {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Criar uma conta
//		Conta conta1 = new Conta();
//		Conta conta2 = new Conta(2, 2);
//		Conta conta3 = new Conta(3);
		
		ContaEspecial cEspc1 = new ContaEspecial();
		ContaEspecial cEspc2 = new ContaEspecial(02, 12000, 100000);
		
		ContaInvestimento cInvest1 = new ContaInvestimento();
		ContaInvestimento cInvest2 = new ContaInvestimento(002, 100000, 1, 30);
		
//		System.out.println("Saldo da conta 1: " + conta1.saldo);
//		System.out.println("Saldo da conta especial: " + cEspc2.getSaldo());
//		System.out.println("Limite da conta especial: " + cEspc2.getLimite());
		
		System.out.println("Saldo atual da conta especial é: " + 
		cEspc2.getSaldo());
		System.out.println("Vamos depositar 1000 conto!");
		cEspc2.depositar(1000);
		System.out.println("Saldo após depósito da conta especial é: " + 
				cEspc2.getSaldo());
		
		System.out.println("Saldo atual da conta invet é: " + 
		cInvest2.getSaldo());
		System.out.println("Vamos depositar 1000 conto!");
		cInvest2.depositar(1000);
		System.out.println("Saldo após depósito da conta invest é: " + 
				cInvest2.getSaldo());
		
		
		
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
