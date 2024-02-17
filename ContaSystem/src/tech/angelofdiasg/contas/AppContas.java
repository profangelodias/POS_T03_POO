package tech.angelofdiasg.contas;

public class AppContas {

	public static void main(String[] args) {

		Conta contaThaiane = new Conta();
		Conta contaThiago = new Conta();
		
		contaThaiane.numero = 1;
		contaThaiane.nome = "Thaiane";
		contaThaiane.limite = 100000;
		contaThaiane.saldo = 25845521;

		contaThiago.numero = 2;
		contaThiago.nome = "Thiago";
		contaThiago.limite = 100000;
		double saldot = contaThiago.saldo = 3352650.123456;
		
		System.out.println("Nome da conta de Thaiane: " + contaThaiane.nome);
		System.out.println("Nome da conta de Thiago: " + contaThiago.nome);
		System.out.printf("SALDO Thiago = %.2f", contaThiago.saldo);
	}

}
