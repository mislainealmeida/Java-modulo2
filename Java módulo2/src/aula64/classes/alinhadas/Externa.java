package aula64.classes.alinhadas;

public class Externa {

	private String texto= "Texto externo";
	
	public class Interna {		
		
		private String texto = "Texto interno"; 
		
		public void imprimeTexto() {
			System.out.println(texto);
			// classe interna consegue ver os membros das classes externas
			System.out.println(Externa.this.texto);
		}
	}
}
