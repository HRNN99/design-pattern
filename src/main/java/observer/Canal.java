package observer;

import java.util.ArrayList;
import java.util.Collection;

public class Canal {

	private String nombre;
	private Collection<Suscriptor> suscriptores = new ArrayList<>();
	
	
	public Canal(String nombre) {
		this.nombre = nombre;
	}

	public void suscribir(Suscriptor sub) {
		suscriptores.add(sub);
	}
	
	public void desSuscribir(Suscriptor sub) {
		suscriptores.remove(sub);
	}
	
	public void notificar() {
		for (Suscriptor suscriptor : suscriptores) {
			suscriptor.actualizar(nombre);
		}
	}
	
	public void subirVideo() {
		notificar();
	}
}
