package personnages;

public class Commerçant {
	private String nom;
	private String boissonPref;
	private int argent;

	public Commerçant(String nom, String boissonPref, int argent) {
		super();
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public int seFaireExtorquer() {
		
	}
	
	public void recevoir(int argent) {
		
	}
}
