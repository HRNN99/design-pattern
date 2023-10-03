package flyweight;

public class Arbol {

	private String x;
	private String y;
	private TipoArbol tipo;
	
	public Arbol(String x, String y, TipoArbol tipo) {
		this.x = x;
		this.y = y;
		this.tipo = tipo;
	}
	
	public void dibujar() {
		tipo.dibujar(x, y);
	}
}
