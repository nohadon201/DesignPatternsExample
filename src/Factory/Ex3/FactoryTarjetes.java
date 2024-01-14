package Factory.Ex3;

import java.util.HashMap;

import Factory.Ex2.Client;
import Factory.Ex2.Tarjeta;

public class FactoryTarjetes {
	public HashMap<String,Tarjeta> arr = new HashMap<String,Tarjeta>();
	public Factory.Ex3.Tarjeta getTarjeta(MarcaTarjeta mt, Categoría category) {
		switch(category) {
			case CREDIT:
				return new GeneradorCredit().generate(mt);
			case DEBIT:
				return new GeneradorDebit().generate(mt);
		}
		return null;
	}
	
}
