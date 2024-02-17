package tech.angelofdiasg.beeJava;
import java.util.Scanner;


public class Desafio1006New {

	public static void main(String[] args) {
		double notaA, notaB, notaC, media;
		Scanner leitor = new Scanner(System.in);
		notaA = leitor.nextDouble();
		notaB = leitor.nextDouble();
		notaC = leitor.nextDouble();
		mediaPonderada(notaA, notaB, notaC);
	}

	static void mediaPonderada(double notaA, double notaB, double notaC) {

		int pesoA, pesoB, pesoC;
		pesoA = 2;
		pesoB = 3;
		pesoC = 5;
		
		double media = ((notaA * pesoA) + (notaB * pesoB)
				+ (notaC * pesoC))/(pesoA + pesoB + pesoC);
		System.out.println(String.format("MEDIA = %.1f", media));
		
	}

}
