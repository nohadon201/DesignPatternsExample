package Decorators.Ex1;

public class Pollastre extends PizzaDecorator {

	public Pollastre(Pizza p) {
		super(p);
		super.preu=1.0;
	}

}
