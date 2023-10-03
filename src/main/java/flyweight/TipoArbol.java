package flyweight;

public class TipoArbol {

	private String nombre;
	private String color;
	private String textura;
	
	public TipoArbol(String nombre, String color, String textura) {
		this.nombre = nombre;
		this.color = color;
		this.textura = textura;
	}
	
	public void dibujar(String x, String y) {
		System.out.println(nombre + " " + color + "\n");
		System.out.println(textura);
	}
}

