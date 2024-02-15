package Seance2_generique;

public class Main {

	public static void main(String[] args) {
		
		
		FileAttente<Personne> FAp = new FileAttente<>();
		//FileAttente<TacheSimple> FAts = new FileAttente<>();
		
		FileAttente<Personne> FAsim = new FileAttente<>();
		FileAttente<Personne> FAdiff = new FileAttente<>();
		

		
		Personne p1 = new Personne("Wassim");
		Personne p2 = new Personne("Chrsitophe");
		Personne p3 = new Personne("Etienne");
		Personne p4 = new Personne("Ben");
		Personne p5 = new Personne("Valentina");
		Personne p6 = new Personne("inda");
		
		TacheSimple ts1 = new TacheSimple("Coder");
		TacheSimple ts2 = new TacheSimple("Rediger");
		TacheSimple ts3 = new TacheSimple("Etudier");
		TacheSimple ts4 = new TacheSimple("Manger");
		TacheSimple ts5 = new TacheSimple("boire");

		
		FAp.entre(p1);
		FAp.entre(p2);
		FAp.entre(p3);
		FAp.entre(p4);
		FAp.entre(p5);
		
		FAsim.entre(p1);
		FAsim.entre(p2);
		FAsim.entre(p3);
		FAsim.entre(p4);
		FAsim.entre(p5);
		
		FAdiff.entre(p1);
		FAdiff.entre(p2);
		FAdiff.entre(p3);
		FAdiff.entre(p6);
		
//		FAts.entre(ts1);
//		FAts.entre(ts2);
//		FAts.entre(ts3);
//		FAts.entre(ts4);
//		FAts.entre(ts5);
		
		System.out.println(FAp.nbElements());
		System.out.println(FAp.toString());
		

		

//		System.out.println(FAts.nbElements());
//		System.out.println(FAts.toString());
		
		System.out.println(FileAttente.allEntries()); // PLEASE SEE THIS AGAIN
		System.out.println("Deux files similaires de mêmes types");
		System.out.println(FileAttente.isSimilar(FAp, FAsim));
		System.out.println("Deux files differentes de mêmes types");
		System.out.println(FileAttente.isSimilar(FAp, FAdiff));
//		System.out.println("Deux files même longueure de  types differents");
//		System.out.println(FAts.lengthSim(FAp));
//		System.out.println("Deux files  longueure differentes de  types differents");
//		System.out.println(FAts.lengthSim(FAdiff));
//		
		FileAttente<Adulte> F1 = new FileAttente<>();
		FileAttente<Enfant> F2 = new FileAttente<>();
		FileAttente<Personne> F3 = new FileAttente<>();
		
	}

}
