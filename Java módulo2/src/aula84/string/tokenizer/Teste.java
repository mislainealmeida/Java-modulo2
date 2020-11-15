package aula84.string.tokenizer;

import java.util.StringTokenizer;

public class Teste {

	public static void main(String[] args) {
		
		String doArquivo = "1;Antônio;30";
		
		StringTokenizer st= new StringTokenizer(doArquivo, ";");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
