package personnages;

public class Yakuza {
	private int reputation = 0;
	private String clan;
	private int argent;

	public Yakuza(int reputation, String clan, int argent) {
		super();
		this.reputation = reputation;
		this.clan = clan;
		this.argent = argent;
	}

	public int getArgent() {
		return argent;
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}

}
