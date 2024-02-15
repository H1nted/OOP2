package Seance3_genericité_bornée;

public class Produit implements ObjetAvecEtiquette {
	
	private String etiquette = "NA";
	
	public Produit() {
		
	}
	
	public Produit (String e) {
		this.setEtiquette(e);
	}
	
	public void setEtiquette(String e) {
		this.etiquette = e;
	}
	
	public String getEtiquette() {
		return this.etiquette;
	}

	public String toString() {
		return "Produit [etiquette=" + etiquette + "]";
	}

	@Override
	public String etiquette() {

		return this.etiquette;
	}
	

}
