package Seance3_genericité_bornée;

public class Main {

	public static void main(String[] args) {
		
			
		Rayon<Livre> Rlivre = new Rayon<>();
		Rayon<Produit> Rproduit = new Rayon<>();
		
		Livre livre1 = new Livre("Death & Taxes");
		Livre livre2 = new Livre("Crime & Punishment");
		Livre livre3 = new Livre("Pride & Prejudice");
		Livre livre4 = new Livre("Beauty & Beast");
		Livre livre5 = new Livre("Bold & Pretty");
		
		Produit produit1 = new Produit("Café");
		Produit produit2 = new Produit("Lait");
		Produit produit3 = new Produit("Chocolat");
		Produit produit4 = new Produit("Sauce");
		Produit produit5 = new Produit("Pâtes");
		
		Rlivre.addContenu(livre1);
		Rlivre.addContenu(livre2);
		Rlivre.addContenu(livre3);
		Rlivre.addContenu(livre4);		
		Rlivre.addContenu(livre5);
		
		System.out.println(Rlivre.listingContenu());
		
		Rproduit.addContenu(produit1);
		Rproduit.addContenu(produit2);
		Rproduit.addContenu(produit3);
		Rproduit.addContenu(produit4);
		Rproduit.addContenu(produit5);
		Rproduit.addContenu(livre1);

		System.out.println(Rproduit.listingContenu());
	}

}
