package tech.angelofdiasg.beeJava;
import java.util.Scanner;

public class Desafio1035 {

	public static void main(String[] args) {
		// Receber 4 valores inteiros
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();
        //Comparações dentro do mesmo if
        if((b > c) && (d > a) && ((c + d) > (a + b)) && (c > 0) 
        		&& (d > 0) && (a%2 == 0)) {
        	System.out.println("Valores aceitos");
        } else {
        	System.out.println("Valores nao aceitos");
        }
        
        formaAlternativa();
	}

	static void formaAlternativa() {
		boolean cond1, cond2, cond3, cond4, cond5, cond6;
		
		Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();
        //Definir as condições
        cond1 = b > c;
        cond2 = d > a;
        cond3 = (c + d) > (a + b);
        cond4 = c > 0;
        cond5 = d > 0;
        cond6 = a%2 == 0;
        //Comparações dentro do mesmo if
        if(cond1 && cond2 && cond3 && cond4
        		&& cond5 && cond6) {
        	System.out.println("Valores aceitos");
        } else {
        	System.out.println("Valores nao aceitos");
        }
		
	}
}
