package aula56.enumeradores.labs;

public class Calculadora {
	private double numero1;
	private double numero2; 
	private Operacoes simbolo;
	
	public Calculadora() {
		super();

	}

	public Calculadora(double numero1, double numero2, Operacoes simbolo) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.simbolo = simbolo;
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public Operacoes getSimbolo() {
		return simbolo;
	}

	public void setOperacao(Operacoes simbolo) {
		this.simbolo = simbolo;
	}

	
}
