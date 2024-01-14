package Factory.Ex3;

import java.util.Random;

public class Tarjeta {
	private int codi;
	private MarcaTarjeta marca;
	public Tarjeta(MarcaTarjeta marca) {
		Random r = new Random();
		String random ="";
		for(int a = 0; a < 8; a++) {
			random+=r.nextInt((9 - 1) + 1) + 1;
		}
		System.out.println(random);
		this.codi=Integer.parseInt(random);
		this.marca=marca;
	}
	@Override
	public String toString() {
		return "Tarjeta [codi=" + codi + ", marca=" + marca + "]";
	}
}
