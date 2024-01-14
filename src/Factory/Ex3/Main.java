package Factory.Ex3;

public class Main {
	public static void main(String[] args) {
		FactoryTarjetes ft = new FactoryTarjetes();
		Tarjeta t = ft.getTarjeta(MarcaTarjeta.VISA, Categoría.CREDIT);
	}
}
