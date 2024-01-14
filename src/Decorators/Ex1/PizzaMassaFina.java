package Decorators.Ex1;

public class PizzaMassaFina implements Pizza {
	public double preu=5.0;
	public String desc;
	@Override
	public String getDesc() {
		
		return desc;
	}

	@Override
	public double getPreu() {
		
		return preu;
	}

}
