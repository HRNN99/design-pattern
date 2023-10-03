package observer;

public class App implements Suscriptor {

	@Override
	public void actualizar(String canal) {
		
		System.out.println("App: " + canal + " ha subido un video nuevo!");
	}

}
