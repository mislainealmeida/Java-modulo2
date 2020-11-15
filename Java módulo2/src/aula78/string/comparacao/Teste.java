package aula78.string.comparacao;

public class Teste {

	public static void main(String[] args) {
		String ola= "Olá";
		String ola2= "OLÁ";
		String ola3= "Olá";
		String ola4 = new String(ola);
		
		System.out.println("ola equals ola2= "+ ola.equals(ola2));
		System.out.println("ola equals ola3= "+ ola.equals(ola3));

		System.out.println("ola equals ola2 = "+ ola.equalsIgnoreCase(ola2));
		System.out.println("ola equals ola3 = "+ ola.equalsIgnoreCase(ola3));
		
		System.out.println("ola == ola2 "+ (ola==ola2));
		System.out.println("ola == ola3 "+ (ola == ola3)); // mesma id
		System.out.println("ola == ola4 "+ (ola == ola4)); // id diferente 
		System.out.println("ola equals ola4 "+ ola.equals(ola4)); // nao olha o id
		System.out.println("ola equals ola4 "+ ola.equalsIgnoreCase(ola4)); // nao olha o id
	
		String banana= "banana";
		String ana= "ana";
		String ban= "ban";
		System.out.println(banana.regionMatches(1, ana, 0, 3));	
		System.out.println(banana.regionMatches(1, ana, 1, 2));	
		banana.regionMatches(true, 0, ban, 0, 3);
		
		System.out.println(banana.endsWith(ana));    // diferencia minuscula e maiuscula
	    System.out.println(banana.startsWith(ban)); // diferencia minuscula e maiuscula
	    
	    String a= "a";
	    String b= "b";
	    String aMaiusculo= "A"; 
	    
	    System.out.println(a.compareTo(b)); // comparar objetos 
	    System.out.println(b.compareTo(a));
	    System.out.println(a.compareTo(aMaiusculo)); //a na tabela ascii= 97, A= 65, ou seja 97-65=32
	   //-1 (a>b) 0 (a=b), 1(a<b)
	    
	    
	}

}
