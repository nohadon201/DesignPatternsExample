package Decorators.Ex2;

public class GruixLiniaDecorator extends FormaDecorator {
	private double gruix;
	public GruixLiniaDecorator(Forma f, double gruix) {
		super(f);
		this.gruix = gruix;
	}

	@Override
	public void dibuixar() {
		this.f.dibuixar();
		System.out.println("Gruix de la línea: "+this.gruix);
		
	}

	@Override
	public void redimensionar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String descripcio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isOcult() {
		// TODO Auto-generated method stub
		return false;
	}

}
