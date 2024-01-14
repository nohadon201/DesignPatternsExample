package Decorators.Ex1;

public class Tomaquet extends PizzaDecorator {
	
	public Tomaquet(Pizza p) {
		super(p);
		super.preu=3.20;
	}
	
}
