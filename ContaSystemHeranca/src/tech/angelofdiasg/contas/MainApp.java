package tech.angelofdiasg.contas;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println();
		//Criar uma conta
		Conta conta1 = new Conta();
		//Atribui valores aos estados
		conta1.numero = 1;
		conta1.saldo = 1000;
		//Sacar e imprimir o saldo
		System.out.println("Infomre o valor para sacar: ");
		if(conta1.sacar(leitor.nextDouble())) {
			System.out.println(conta1.getSaldo());
		} else {
			System.out.println("Não tem saldo!");
		}
		
		//Depositar e imprimir o saldo
		
	}

}
