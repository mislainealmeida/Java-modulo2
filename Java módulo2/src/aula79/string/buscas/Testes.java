package aula79.string.buscas;

public class Testes {

	public static void main(String[] args) {
		String banana = "banana";
		String ana= "ana";
		
		System.out.println(banana.indexOf('x'));
		System.out.println(banana.indexOf('b'));
		System.out.println(banana.indexOf('a'));
		System.out.println(banana.indexOf(ana));
		System.out.println(banana.indexOf('n'));
		
		System.out.println(banana.lastIndexOf('a'));
		System.out.println(banana.contains(ana));
		System.out.println(banana.contains("b"));
		System.out.println(banana.contains("x"));

	}

}
