package tech.angelofdiasg.beeJava;
import java.util.Scanner;

public class Desafio1005 {

	public static void main(String[] args) {
		double notaA, notaB;
		Scanner leitor = new Scanner(System.in);
		notaA = leitor.nextDouble();
		notaB = leitor.nextDouble();
		mediaPonderada(notaA, notaB);
	}

	static void mediaPonderada(double notaA, double notaB) {

		double pesoA, pesoB;
		pesoA = 3.5;
		pesoB = 7.5;
		
		double media = ((notaA * pesoA) + (notaB * pesoB)
			)/(pesoA + pesoB);
		System.out.println(String.format("MEDIA = %.1f", media));
		
	}

}
