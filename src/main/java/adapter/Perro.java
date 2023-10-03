package adapter;

public class Perro implements Canino {

	private boolean vive = false;
	
	public Perro() {
		this.vive = true;
	}

	public void ladrar() {
		System.out.println("Woof!");
	}

	public boolean estaVivo() {
		return vive;
	}

}
