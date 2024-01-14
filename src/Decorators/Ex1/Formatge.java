package Decorators.Ex1;

public class Formatge extends PizzaDecorator {

	public Formatge(Pizza p) {
		super(p);
		super.preu=4.50;
	}

}
