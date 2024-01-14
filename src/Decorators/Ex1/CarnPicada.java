package Decorators.Ex1;

public class CarnPicada extends PizzaDecorator {

	public CarnPicada(Pizza p) {
		super(p);
		super.preu=6.9;
	}
	

}
