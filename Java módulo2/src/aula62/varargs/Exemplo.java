package aula62.varargs;

public class Exemplo {

	public static void main(String[] args) {
	// a partir do java 5	
		 
		
		System.out.println(soma(1,2,3,4,5,6,7,8,9,10));

		
	}
	static int soma(int a, int b, Integer...vetor) {
		int total=0;
		for (int i=0; i< vetor.length; i++) {
			total+= vetor[i];
		}
		return total; 
	}

}
