package aula83.string.builder.buffer;

public class Teste {

	public static void main(String[] args) {
		String[] letras = {"B", "C", "D", "E", "F"};
		String alfabeto = "";
		
		StringBuffer sb= new StringBuffer();
		for (String letra: letras) {
			sb.append(letra);
		}
		alfabeto = sb.toString(); // ou alfabeto = new String (sb);
		System.out.println(alfabeto);

		System.out.println(sb.reverse());
		
		StringBuilder sb_= new StringBuilder();
		for (String letra: letras) {
			sb_.append(letra);
		}
		alfabeto = sb_.toString(); 
		System.out.println(alfabeto);
		
	}

}
