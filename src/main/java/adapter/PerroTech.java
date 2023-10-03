package adapter;

public class PerroTech implements Robot {

	private boolean pilas = false;
	
	public PerroTech() {
		this.pilas = true;
	}

	public void reproducirSonido() {
		System.out.println("Wo-ho-f!");
	}

	public boolean estaCargado() {
		return pilas;
	}

}
