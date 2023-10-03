package observer;

public class Main {

	public static void main(String[] args) {
				
		App app = new App();
		Mail mail = new Mail();
		Pagina web = new Pagina();
		
		Canal canal1 = new Canal("Canal1");
		
		canal1.suscribir(app);
		canal1.suscribir(web);
		canal1.suscribir(mail);
		
		canal1.subirVideo();
	}
}


