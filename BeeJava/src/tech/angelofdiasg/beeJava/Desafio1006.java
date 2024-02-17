package tech.angelofdiasg.beeJava;
import java.util.Scanner;


public class Desafio1006 {

	public static void main(String[] args) {
		//Receber 3 valores (A,B e C)
		//Objeto Scanner
		Scanner inputi = new Scanner(System.in);
		// Receber os valores e atribuir as variáveis
		double A = inputi.nextDouble();
		double B = inputi.nextDouble();
		double C = inputi.nextDouble();
		//Cálculo da média
		double media = ((A * 2) + (B * 3) + (C * 5))/10;
		//Saída
		System.out.println(String.format("MEDIA = %.1f", media));

	}

}
