package Adapter;

public interface Aniversari {
	public int getAny();
	public Mes getMes();
	public int getDia();
	public boolean isLaterThan(Aniversari altre);
	public boolean isSame(Aniversari altre);
}
