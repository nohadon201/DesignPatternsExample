package Observers;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Videojoc implements PropertyChangeListener {
	private String Name,Nick;
	private int Record;
	public Videojoc(String name, String nick, int record) {
		super();
		Name = name;
		Nick = nick;
		Record = record;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getNick() {
		return Nick;
	}
	public void setNick(String nick) {
		Nick = nick;
	}
	public int getRecord() {
		return Record;
	}
	public void setRecord(int record) {
		Record = record;
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		Jugador j = (Jugador) evt.getSource();
		if(j.Score>this.Record) {
			this.setNick(j.NickName);
			this.setRecord(j.Score);
		}
		
	}
	
	
}
