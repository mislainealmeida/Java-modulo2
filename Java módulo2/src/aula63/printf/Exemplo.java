package aula63.printf;

public class Exemplo {

	public static void main(String[] args) {
		System.out.printf("%s ", " Olá Mundo!");
		System.out.println();
		System.out.printf("%S ", " Olá Mundo!");// S maiusculo, passar todo o texto para a caixa alta
		System.out.printf("%n");
		System.out.printf("%c", 'c');
		System.out.printf("%n");

		int valor = 123456789;

		System.out.printf("%d", valor);

		double pontoFlutuante = 3.1456789;
		System.out.printf("%n");
		System.out.printf("%f", pontoFlutuante);
		System.out.printf("%n");
		System.out.printf("%n");
		String olaMundo = "Olá, Mundo!";
		System.out.printf("%20s", olaMundo);// a direita
		System.out.printf("%n");
		System.out.printf("%-20s", olaMundo);// a esquerda
		System.out.printf("%n");
		System.out.printf("%+d", valor);// imprimi se é positivo ou negativo
		System.out.printf("%n");
		System.out.printf("%,d", valor);

		int valor2 = -123456789;

		System.out.printf("%n");
		System.out.printf("% d", valor2);// se for positivo não imprimi o sinal, imprimi um espaço
		System.out.printf("%n");
		TesteMaisCompleto();
		

	}

	private static void TesteMaisCompleto(){
		double[] precos = { 1000, 123.54, 24.5, 1, 88 };
		for (int i = 0; i < precos.length; i++) {

			System.out.printf("%s %02d: total de R$%, 10.2f%n", "Item ", i + 1, precos[i]);
		}
	}
}

