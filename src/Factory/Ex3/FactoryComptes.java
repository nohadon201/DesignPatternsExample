package Factory.Ex3;

public class FactoryComptes {
	public Compte generate(String nom, Banc b, TipusCompte tc) {
		switch(tc) {
			case INVERSION:
				return new CompteInversió(nom, b);
			case PENSION:
				return new ComptePensio(nom, b);
			case JOVE:
				return new CompteJove(nom, b);
			case ESTALVI:
				return new CompteEstalvi(nom, b);
			case CORRENT:
				return new CompteCorrent(nom, b);
			default:
				return null;
		}
	}
}
