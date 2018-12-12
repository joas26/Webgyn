package br.unitins.webgyn.model;
 public enum DiasSemana {
	
	DOMINGO(1,"Domingo"), SEGUNDA(2,"Segunda"), TERCA(3, "Terça"), QUARTA(4, "Quarta"), QUINTA(5,"Quinta"), SEXTA(6,"Sexta"), SABADO(7, "Sabado");
 	
	private int id;
	private String label;
	
	private DiasSemana(int id, String label) {
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