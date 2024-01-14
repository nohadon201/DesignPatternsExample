package Decorators.Ex2;

public abstract class FormaDecorator implements Forma{
	Forma f;
	public FormaDecorator(Forma f) {
		this.f = f;
	}

}
