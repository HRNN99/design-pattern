package observer;

public class Mail implements Suscriptor {

	@Override
	public void actualizar(String canal) {
		
		System.out.println("Mail: " + canal + " ha subido un video nuevo!");
	}

}
