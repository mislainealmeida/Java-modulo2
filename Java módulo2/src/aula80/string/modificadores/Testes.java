package aula80.string.modificadores;

public class Testes {

	public static void main(String[] args) {
		String teste= "Isso � um teste.";
		System.out.println(teste);
		
		System.out.println(teste.substring(10));
		System.out.println(teste.substring(10, 15));
		
		String ola= "ol� ";
		String mundo = "mundo";
		String olaMundo= ola.concat(mundo);
		System.out.println(olaMundo);
		
		String espacos = "i s p a � o";
		String semEspacos= espacos.replace('i', 'e');
		System.out.println(semEspacos);
				
		semEspacos = semEspacos.replaceAll(" ", "");
		System.out.println(semEspacos);
		
		String nome= " meu nome �: ";
		System.out.println(nome);
		System.out.println(nome.trim()); // removeu os espa�os da frente e do final
		
		
		

	}

}
