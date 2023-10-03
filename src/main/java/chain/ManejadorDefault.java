package chain;

public abstract class ManejadorDefault implements Manejador {

	private Manejador siguiente;
	
	
	public ManejadorDefault(Manejador siguiente) {
		this.siguiente = siguiente;
	}
	
	public ManejadorDefault() {
	}

	@Override
	public Manejador setSiguiente(Manejador m) {
		this.siguiente = m;
		return m;
	}

	@Override
	public boolean ejecutar(String request) {
		if(siguiente != null) {
			return siguiente.ejecutar(request);
		}
		return true;
	}
}

