package Factory.Ex3;

import java.util.ArrayList;

public class Banc {
	private String nom;
	public Banc(String nom) {
		this.nom=nom;
	}
	@Override
	public String toString() {
		return "Banc [nom=" + nom + "]";
	}
}
