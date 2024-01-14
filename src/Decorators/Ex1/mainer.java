package Decorators.Ex1;

public class mainer {
	public static void main(String[] args) {
		Pizza p = new Pernil(new OlivesVerdes(new Brocoli(new PizzaMassaClassica())));
		System.out.println(p.getPreu());
		
	}
}
