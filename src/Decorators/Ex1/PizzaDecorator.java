package Decorators.Ex1;

public abstract class PizzaDecorator implements Pizza {
	Pizza p;
	double preu;
	public PizzaDecorator(Pizza p) {
		this.p = p;
	}
	@Override
	public String getDesc() {
		return p.getDesc();
	}
	@Override
	public double getPreu() {
		return p.getPreu()+this.preu;
	}
}
