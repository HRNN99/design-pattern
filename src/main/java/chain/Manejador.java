package chain;

public interface Manejador {
	
	public Manejador setSiguiente(Manejador m);
	public boolean ejecutar(String request);
	
}
