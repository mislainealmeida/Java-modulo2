package aula56.enumeradores.labs;

public enum Operacoes {
	SOMAR("+") {
		@Override
		public double executarOperacoes(double numero1, double numero2) {
			return numero1 + numero2;
		}
	}, SUBTRAIR("-") {
		@Override
		public double executarOperacoes(double numero1, double numero2) {
			return numero1 - numero2;
		}
	}, MULTIPLICAR("*") {
		@Override
		public double executarOperacoes(double numero1, double numero2) {
			return numero1 * numero2;
		}
	}, DIVIDIR("/") {
		@Override
		public double executarOperacoes(double numero1, double numero2) {
			if (numero2==0) {
				System.out.println("Operação inválida"); 
			}
			
			return numero1/ numero2;
		}
	};
	
	private String simbolo;

	Operacoes(String simbolo) {
		this.simbolo = simbolo;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	@Override
	
	public String toString() {
		return this.simbolo;
	}
	

	public abstract double executarOperacoes(double numero1, double numero2);


}


