package Decorators.Ex1;

public class OlivesVerdes extends PizzaDecorator {

	public OlivesVerdes(Pizza p) {
		super(p);
		super.preu=0.30;
	}

}
