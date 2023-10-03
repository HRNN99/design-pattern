package adapter;

public class PerroTechAdapter implements Canino {

	private Robot perrobot;
	
	public PerroTechAdapter(Robot perrobot) {
		this.perrobot = perrobot;
	}

	public void ladrar() {
		perrobot.reproducirSonido();
	}

	public boolean estaVivo() {
		return perrobot.estaCargado();
	}

}
