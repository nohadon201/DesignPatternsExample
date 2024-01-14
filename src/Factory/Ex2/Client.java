package Factory.Ex2;

public class Client {
	private String nom;
	private int Salari;
	private Tarjeta tarjeta;
	public Client(String nom, int salari) {
		super();
		this.nom = nom;
		Salari = salari;
	}
	public Tarjeta getTarjeta() {
		return this.tarjeta;
	}
	public void setTarjeta(Tarjeta t) {
		this.tarjeta=t;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getSalari() {
		return Salari;
	}
	public void setSalari(int salari) {
		Salari = salari;
	}
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", Salari=" + Salari + ", tarjeta=" + tarjeta + "]";
	}
}
