package Factory.Ex1;

public class Cotxe {
	Ubicacions ubicacio;
	public Cotxe(Ubicacions ub) {
		this.ubicacio=ub;
	}
	@Override
	public String toString() {
		return "Cotxe [ubicacio=" + ubicacio + "]";
	}
}
