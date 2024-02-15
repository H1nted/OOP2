package Seance3_genericité_bornée;

public class Livre extends Produit{
	
	private String nom;
	private String auteur;
	
	public Livre(String p) {
		super(p);
	}
	
	public Livre (String p,String n) {
		super(p);
		this.nom = n;
	}
	
	public Livre(String p, String n, String a) {
		super(p);
		this.nom = n;
		this.auteur = a;
	}

	
}
