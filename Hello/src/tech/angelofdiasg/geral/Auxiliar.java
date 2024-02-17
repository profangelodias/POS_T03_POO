package tech.angelofdiasg.geral;

public class Auxiliar {
//variável
	int numero = 1;

//	métodos (funções)
	void exibirTexto() {
//		Vai imprimir no console apenas um texto
		System.out.println("Hello World!");
	}

	void mudarNumero() {
//		mudar o estado do "int numero"
		numero = 2;
		System.out.println(numero);
	}

	int soma(int num1, int num2) {
//		soma de dois números recebidos (parâmetros), porque não fazem parte do objeto auxiliar 
		int soma = num1 + num2;
		return soma;
	}

	void exibirNumero() {
//		 exibir o estado atual do "int numero"
		System.out.println(numero);
	}
}
