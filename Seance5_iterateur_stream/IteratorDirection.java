package Seance5_iterateur_stream;

import java.util.Iterator;

public class IteratorDirection implements Iterator<EmployeLycee>{
	
	private DirectionLycee dl;
	private int compteur;

	public IteratorDirection(DirectionLycee directionLycee) {
		this.dl = directionLycee;
		this.compteur = 0;
	}

	@Override
	//introspection (for attribute knowledge) class.forname("Seance5_iterateur_stream.DiectionLycee").g
	public boolean hasNext() {
		return compteur < 5;
		
//		try {
//			return compteur < Class.forName("Seance5_iterateur_stream.DiectionLycee").getFields().length;
//		} catch (SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace("CLASSE INTROUVABLE");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return false;
	}

	@Override
	public EmployeLycee next() {
		if (this.compteur == 0) {
			this.compteur +=1;
			return dl.getProviseur();
		}
		if (this.compteur == 1) {
			this.compteur +=1;
			return dl.getProviseurAdjoint();
		}
		if (this.compteur == 2) {
			this.compteur +=1;
			return  dl.getConseillerPrincipaldEducation();
		}
		if (this.compteur == 3) {
			this.compteur +=1;
			return dl.getGestionnaire();
		}
		else
		this.compteur +=1 ;
		return dl.getChefDeTravaux();
	}
	
	
	public EmployeLycee nextSwitch() {
		EmployeLycee e = null;
		switch(compteur) {
		case 0: e = dl.getProviseur();
		case 1: e = dl.getProviseurAdjoint();
		case 2: e = dl.getConseillerPrincipaldEducation();
		case 3: e = dl.getGestionnaire();
		case 4: e = dl.getChefDeTravaux();
		}
		compteur += 1;
		return e;
		
	}



}
