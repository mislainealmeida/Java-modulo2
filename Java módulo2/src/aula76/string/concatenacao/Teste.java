package aula76.string.concatenacao;

public class Teste {

	public static void main(String[] args) {
		String curso = "Curso ";
		String java= "Java";
		
		String cursoJava= curso + java; 
		System.out.println(cursoJava); 
		

		String resultado2com2= "Resultado 2+2 ="+ (2+2);
		System.out.println(resultado2com2);
		
		String resultado2com2_= "Resultado 2+2 ="+ 2+2;
		System.out.println(resultado2com2_);
		
		String um= String.valueOf(1);
		System.out.println(um);
		
		String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, "+
		"sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad "+
		"minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex "+
		"ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse "+
		"cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident,"+
		"sunt in culpa qui officia deserunt mollit anim id est laborum.";
		
		System.out.println(concatenacao);
		
		String concatenacao2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, ";
		concatenacao2 += "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad ";
		concatenacao2 += "minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ";
		concatenacao2 += "ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse ";
		concatenacao2 += "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident,";
		concatenacao2 += "sunt in culpa qui officia deserunt mollit anim id est laborum.";
				
		System.out.println(concatenacao);
	}

}
