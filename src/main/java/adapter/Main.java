package adapter;

public class Main {

	public static void main(String[] args) {
				
		Canino perro = new Perro();
		//Canino perro2 = new PerroTech();
		PerroTech perroTech = new PerroTech();
		Canino perro2 = new PerroTechAdapter(perroTech);
		
		System.out.println("Vive?: " + perro.estaVivo());
		perro.ladrar();
		System.out.println("\n\n");
		System.out.println("Vive?: " + perro2.estaVivo());
		perro2.ladrar();
	}
}


