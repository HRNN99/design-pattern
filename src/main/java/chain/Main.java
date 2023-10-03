package chain;

public class Main {

	public static void main(String[] args) {
		
		String request = "Juan";
		
		Manejador manejadorCred = new CredencialesManejador();
		Manejador manejadorVal1 = new Validacion1Manejador();
		Manejador manejadorVal = new Validacion1Manejador();
		Manejador manejadorVal2 = new Validacion2Manejador();
		
		manejadorCred.setSiguiente(manejadorVal1);
		manejadorVal1.setSiguiente(manejadorVal);
		manejadorVal.setSiguiente(manejadorVal2);
			
		if(manejadorCred.ejecutar(request)) {
			System.out.println("Validacion completada con exito");
		}else {
			System.out.println("Validacion con error");
		}
		
	}
}


