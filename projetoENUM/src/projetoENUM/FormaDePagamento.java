package projetoENUM;

public enum FormaDePagamento {
	DINHEIRO("DIN","Dinheiro"),
	CARTAO_CREDITO("CCR", "Cartão de Crédito"),
	CARTAO_DEBITO("CDB", "Cartão de Débito"),
	PIx("PIx", "Pix"),
	TRANSFERENCIA("TRN", "Transferencia");

	private final String codigo;
	private final String descricao;
	
	FormaDePagamento(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
