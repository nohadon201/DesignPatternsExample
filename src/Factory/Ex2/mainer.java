package Factory.Ex2;

public class mainer {
	public static void main(String[] args) {
		Client c = new Client("Antonio", 451);
		c.setTarjeta(new FactoryTarjetes().getTarjeta(c));
		System.out.println(c.toString());
	}
}
