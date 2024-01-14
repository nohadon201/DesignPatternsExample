package Observers;

import java.util.ArrayList;

public class mainer2 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("viatjar");
		arr.add("bitllet");
		arr.add("cotxe");
		arr.add("frontera");
		arr.add("oso");
		arr.add("lolis");
		arr.add("hentai");
		arr.add("testiculo");
		arr.add("RusosNazisDeMierda");
		VigilanteDeLaSSRU vig = new VigilanteDeLaSSRU(arr);
		Chat c = new Chat();
		c.observers.add(vig);
		while(true) {
			c.Actualizar();
		}
	}
}
