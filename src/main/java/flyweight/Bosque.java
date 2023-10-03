package flyweight;

import java.util.ArrayList;
import java.util.Collection;

public class Bosque {

	Collection<Arbol> arboles = new ArrayList<Arbol>();
	
	public void plantarArbol(String x,
			String y,
			String nombre,
			String color,
			String textura) {
		
		TipoArbol tipo = new TipoArbol(nombre, color, textura);
		Arbol arbol = new Arbol(x, y, tipo);
		arboles.add(arbol);
		
	}
	
	public void dibujar() {
		for (Arbol arbol : arboles) {
			arbol.dibujar();
			System.out.println("\n\n");
		}
	}
}
