package Decorators.Ex1;

public class PizzaMassaClassica implements Pizza{
	public double preu = 5.45;
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
