package Decorators.Ex1;

public class Pernil extends PizzaDecorator {

	public Pernil(Pizza p) {
		super(p);
		super.preu=2.0;
	}

}
