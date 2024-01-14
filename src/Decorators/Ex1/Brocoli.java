package Decorators.Ex1;

public class Brocoli extends PizzaDecorator {

	public Brocoli(Pizza p) {
		super(p);
		super.preu=3.0;
	}

}
