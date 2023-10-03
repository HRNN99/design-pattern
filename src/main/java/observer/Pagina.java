package observer;

public class Pagina implements Suscriptor {

	@Override
	public void actualizar(String canal) {
		
		System.out.println("Web: " + canal + " ha subido un video nuevo!");
	}

}
