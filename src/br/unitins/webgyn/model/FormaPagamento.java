package br.unitins.webgyn.model;

public enum FormaPagamento {
	
	MENSAL(0, "Mensal"),
	TRIMESTRAL(1, "Trimestral"),
	SEMESTRAL(2, "Semestral");
	
	private int id;
	private String label;
	
	private FormaPagamento(int id, String label) {
		this.id = id;
		this.label = label;
	}
	
	public int getId() {
		return id;
	}
	
	public String getLabel() {
		return label;
	}
}
