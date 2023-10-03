package flyweight;

public class Main {

	public static void main(String[] args) {
				
		Bosque bosque = new Bosque();
		
		bosque.plantarArbol("2", "3", "arbol", "verde", Helper.arbol1);
		bosque.plantarArbol("4", "5", "arbol2", "rojo", Helper.arbol1);
		bosque.plantarArbol("100", "100", "arbol3", "rojo", Helper.arbol3);
		bosque.dibujar();
	}
}


