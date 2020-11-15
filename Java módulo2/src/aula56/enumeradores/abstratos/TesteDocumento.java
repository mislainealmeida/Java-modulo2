package aula56.enumeradores.abstratos;

public class TesteDocumento {

	public static void main(String [] args) {
		/*for(TipoDocumento doc : TipoDocumento.values()) {
			System.out.println(doc +" - "+ doc.geraNumeroTeste());
		}*/
		Pessoa pf = new Pessoa();
		pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
		pf.setNumDocumento(pf.getTipoDocumento().geraNumeroTeste());
		System.out.println(pf);
		
		Pessoa pj = new Pessoa();
		pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
		pj.setNumDocumento(pj.getTipoDocumento().geraNumeroTeste());
		System.out.println(pj);
	}
}
