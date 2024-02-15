package Seance2_generique;

public class Paire <A,B>
{
	private A fst;
	private B snd;
	
	public Paire() {}
	public Paire(A f, B s) {
		this.fst= f;
		this.snd = s;
	}
	
	public A getFst() {
		return this.fst;
	}
	
	public B getSnd() {
		return this.snd;
}
	public void setFst (A a) {
		this.fst = a;
	}
	
	public void setSnd (B b) {
		this.snd = b;
	}
	
	public String toString() {
		return this.getFst() + "-" + this.getSnd();
	}

}