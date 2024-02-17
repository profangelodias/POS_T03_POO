package tech.angelofdiasg.geral;

public class MainApp {

	public static void main(String[] args) {
//		Imprime no console
		System.out.println("Bom dia, MEU POVO!");
		
//		variáveis dos objetos (redundância obrigatória)
		Auxiliar auxiliar1 = new Auxiliar();
		Auxiliar auxiliar2 = new Auxiliar();
		Auxiliar auxiliar3 = new Auxiliar();
		
//		Utilização dos objetos
		System.out.println("O texto do auxiliar1: ");
		auxiliar1.exibirTexto();
		System.out.println("Mudança do número do auxiliar2: ");
		auxiliar2.mudarNumero();
		System.out.println("Exibir o número do auxiliar1: ");
		auxiliar1.exibirNumero();
		System.out.println("Exibir o número do auxiliar2: ");
		auxiliar2.exibirNumero();
//		Usar os métodos da classe no
//		auxiliar3
		System.out.println("O texto do auxiliar3: ");
		auxiliar3.exibirTexto();
		System.out.println("Mudar o número do auxiliar3: ");
		auxiliar3.mudarNumero();
		System.out.println("Exibir o número do auxiliar3: ");
		auxiliar3.exibirNumero();
//		Concatenando um texto com o retorno da função/método somar(num1.num2)
		System.out.println("Soma dos números (3,5) no auxiliar3: "
		+ auxiliar3.soma(3,5));
	}
}
