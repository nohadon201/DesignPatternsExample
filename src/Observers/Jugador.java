package Observers;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class Jugador {
	String NickName;
	int Score;
	ArrayList<Channel> arr = new ArrayList<Channel>();
	public PropertyChangeSupport pcs;
	public Jugador(String nickName, int score) {
		super();
		NickName = nickName;
		Score = score;
	}
	public void FinalitzarPartida() {
		pcs.firePropertyChange(NickName, arr, Score);
	}
	
	public void suscribirse(Videojoc a) {
		pcs.addPropertyChangeListener((PropertyChangeListener) a);
	}
	
	
	
}
