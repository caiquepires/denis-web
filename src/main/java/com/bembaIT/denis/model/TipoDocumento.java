package com.bembaIT.denis.model;

public enum TipoDocumento {

	CPF("CPF"),
	CNPJ("CNPJ");
	
	private String descricao;
	
	private TipoDocumento(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
