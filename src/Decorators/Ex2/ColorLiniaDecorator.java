package Decorators.Ex2;

public class ColorLiniaDecorator extends FormaDecorator {
	Color c;
	

	public ColorLiniaDecorator(Forma f, Color c) {
		super(f);
		this.c = c;
	}

	@Override
	public void dibuixar() {
		this.f.dibuixar();
		System.out.println("Color de la línea: "+c.toString());
	}

	@Override
	public void redimensionar() {
		
	}

	@Override
	public String descripcio() {
		return null;
	}

	@Override
	public boolean isOcult() {
		return false;
	}

}
