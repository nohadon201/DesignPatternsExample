package Observers;

import java.util.ArrayList;
import java.util.Scanner;

public class Chat{
	public String current_phrase;
	public ArrayList<Channel> observers =new ArrayList<Channel>();
	public void Actualizar() {
		Scanner sc = new Scanner(System.in);
		current_phrase=sc.nextLine();
		for(Channel ch : observers) {
			ch.Update(this);
		}
		
	}
	
	
}
