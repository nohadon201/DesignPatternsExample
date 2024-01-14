package Decorators.Ex2;

public class mainer {
	public static void main(String[] args) {
		Forma pentagon2 = new ColorEmplenamentDecorator(new ColorLiniaDecorator(new EstilLiniaDecorator(
		        new GruixLiniaDecorator(new Pentagon(), 2.0d), TipusLinea.ESPAI_GUIO), Color.LIME), Color.AQUA);
		pentagon2.dibuixar();
	}
}
