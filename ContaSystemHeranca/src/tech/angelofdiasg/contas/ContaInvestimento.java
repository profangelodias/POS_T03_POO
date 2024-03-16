package tech.angelofdiasg.contas;

public class ContaInvestimento extends Conta {
	private double taxa;
	private int prazo;
	
	public ContaInvestimento() {
		System.out.println("Conta Investimento criada vazia a seu dispor!");
	}
	public ContaInvestimento(int numero, double saldo, double taxa, int prazo) {
		super(numero, saldo);
		this.taxa = taxa;
		this.prazo = prazo;
	}
	//Métodos / Comportamentos
		public boolean sacar(double val) {
			//Lógica para retornar booleano caso o saque
			//aconteça
			if(getSaldo() >= val) {
				setSaldo(getSaldo() - (1 + (this.taxa/100)));
				return true;
			} else {
				//Lógica para retornar booleano caso o saque
				//NÃO aconteça
				System.out.println("Não tem saldo suficiente!");
				return false;
			}
		}	
		public boolean depositar(double val) {
			if(val < 0) {
				return false;
			} else {
				setSaldo(getSaldo() + val * (1 + (this.taxa/100)));
				return true;
			}
		}
		
		public void aplicarRendimento(double taxa) {
			setSaldo(getSaldo() * (1 + (taxa/100)));
		}
		public double getTaxa() {
			return taxa;
		}
		public void setTaxa(double taxa) {
			this.taxa = taxa;
		}
		public int getPrazo() {
			return prazo;
		}
		public void setPrazo(int prazo) {
			this.prazo = prazo;
		}
		
		
		

}
