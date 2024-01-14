package Factory.Ex2;

import java.util.Random;

public class TarjetaDebit extends Tarjeta{
	private int codi;
	public TarjetaDebit() {
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
		return "TarjetaDebit [codi=" + codi + "]";
	}
}
