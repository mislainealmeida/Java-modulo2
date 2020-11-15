package aula56.enumeradores.abstratos;

public class Pessoa {

	private TipoDocumento tipoDocumento; 
	private String numDocumento;
	
	public Pessoa() {
		super();
	}

	public Pessoa(TipoDocumento tipoDocumento, String numDocumento) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numDocumento = numDocumento;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	@Override
	public String toString() {
		return "Pessoa [tipoDocumento=" + tipoDocumento + ", numDocumento=" + numDocumento + "]";
	}
	
	
}
