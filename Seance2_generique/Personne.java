package Seance2_generique;

public class Personne implements Uwelcome {
	
	private String name ;
	private boolean status;

	
	public Personne() {}
	public Personne(String name) {

		this.setName(name) ;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Personne [name=" + name + "]";
	}
	
	public void setStatus(boolean b) {
		this.status = b;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	@Override
	public boolean isInvite() {
		return this.status;
		
	}
	
	
	
	

}
