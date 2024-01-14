package Observers;

import java.util.ArrayList;
import java.util.HashMap;

public class VigilanteDeLaSSRU implements Channel {
	public HashMap<String,Integer> ParaulesProhibides = new HashMap<String,Integer>();
	public VigilanteDeLaSSRU(ArrayList<String> arr) {
		for (String str : arr) {
			ParaulesProhibides.put(str, 0);
		}
	}
	@Override
	public void Update(Object o) {
		if(o instanceof Chat) {
			Chat c = (Chat) o;
			if(this.ParaulesProhibides.containsKey(c.current_phrase) && this.ParaulesProhibides.get(c.current_phrase)+1==5) {
				System.err.println("Cridar a Policia Militar!! Hi ha molts traidors!!! ");
			}else if(this.ParaulesProhibides.containsKey(c.current_phrase)) {
				this.ParaulesProhibides.put(c.current_phrase, this.ParaulesProhibides.get(c.current_phrase)+1);
				System.err.println("Aquest és un traidor!!");
			}
		}
		
	}
	
}
