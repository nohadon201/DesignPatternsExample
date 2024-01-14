package Decorators.Ex2;

public class EstilLiniaDecorator extends FormaDecorator {
	TipusLinea tl;
	public EstilLiniaDecorator(Forma f, TipusLinea tl) {
		super(f);
		this.tl = tl;
	}

	@Override
	public void dibuixar() {
		this.f.dibuixar();
		System.out.println("Estil de la línea: "+tl.toString());
		
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
