package Observer;

import java.util.ArrayList;

public class AgenteDeBolsa implements Observable {

	private ArrayList<Observer> observadores;

	public AgenteDeBolsa() {
		observadores = new ArrayList<Observer>();
	}

	public void subeLaBolsa() {
		notificar();
	}

	public void enlazarObservador(Observer o) {
		observadores.add(o);
	};

	@Override
	public void notificar() {

		for (Observer o : observadores) {
			o.update();
		}

	}

}
