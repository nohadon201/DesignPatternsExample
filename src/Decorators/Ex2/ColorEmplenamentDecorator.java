package Decorators.Ex2;

public class ColorEmplenamentDecorator extends FormaDecorator {
	private Color c;
	public ColorEmplenamentDecorator(Forma f, Color c) {
		super(f);
		this.c = c;
	}

	@Override
	public void dibuixar() {
		// TODO Auto-generated method stub
		this.f.dibuixar();
		System.out.println("Color Emplenament: "+c.toString());
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
