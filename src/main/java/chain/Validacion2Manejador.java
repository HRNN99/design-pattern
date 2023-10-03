package chain;

public class Validacion2Manejador extends ManejadorDefault {

	@Override
	public boolean ejecutar(String request) {
		if("Juan".equals(request)){
			return super.ejecutar(request);
		}
		return false;
	}

}
