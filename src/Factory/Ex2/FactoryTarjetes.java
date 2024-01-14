package Factory.Ex2;

import java.util.ArrayList;
import java.util.HashMap;

public class FactoryTarjetes {
	public HashMap<String,Tarjeta> arr = new HashMap<String,Tarjeta>();
	public Tarjeta getTarjeta(Client c) {
		if(arr.containsKey(c.getNom())) {
			System.err.println("Tú so asqueroso, que haces intentando crearte otra tarjeta si ya tienes. Lelo >:(");
			return arr.get(c.getNom());
		}else {
			if(c.getSalari()<=0) {
				System.err.println("PAGA MALDITO RATA! SÍ TÚ! QUE SE QUE ANDAS POR AHÍ CREANDO TARJETAS SIN TENER UN DURO, MUERTO DE HAMBRE >:(");
				return null;
			}else if(c.getSalari()<=425) {
				return new TarjetaDebit();
			}else {
				return new TarjetaCredit();
			}
		}
	}
}
