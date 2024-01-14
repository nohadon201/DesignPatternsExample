package Decorators.Ex1;

public class Espinaques extends PizzaDecorator {

	public Espinaques(Pizza p) {
		super(p);
		super.preu=2.0;
	}

}
