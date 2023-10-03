package chain;

public class CredencialesManejador extends ManejadorDefault {

	@Override
	public boolean ejecutar(String request) {
		if("Juan".equals(request)){
			return super.ejecutar(request);
		}
		return false;
	}

}
