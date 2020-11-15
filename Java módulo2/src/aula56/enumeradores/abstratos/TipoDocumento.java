package aula56.enumeradores.abstratos;

public enum TipoDocumento {
	CPF {
		@Override
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cnpj();
		}
	}, CNPJ {
		@Override
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cnpj();
		}
	};
	
	
	public abstract String geraNumeroTeste();
	
}
