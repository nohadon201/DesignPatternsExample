package Decorators.Ex1;

public class Feta extends PizzaDecorator {

	public Feta(Pizza p) {
		super(p);
		super.preu=0.29;
	}

}
