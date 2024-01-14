package Factory.Ex3;

import java.util.Random;

public class Compte {
	private int codi;
	private String nom_client;
	private Banc banc;
	public Compte(String nom_client, Banc Banc) {
		this.banc=Banc;
		this.nom_client=nom_client;
		Random r = new Random();
		String random ="";
		for(int a = 0; a < 8; a++) {
			random+=r.nextInt((9 - 1) + 1) + 1;
		}
		System.out.println(random);
		this.codi=Integer.parseInt(random);
	}
	@Override
	public String toString() {
		return "Compte [codi=" + codi + ", nom_client=" + nom_client + ", nom_Banc=" + banc + "]";
	}
}
