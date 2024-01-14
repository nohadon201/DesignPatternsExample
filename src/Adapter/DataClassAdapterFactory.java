package Adapter;

public class DataClassAdapterFactory implements AniversariFactory {
	
	@Override
	public Aniversari create(int any, Mes mes, int dia) {
		
		return new AniversariClass(dia,mes,any);
	}

}
