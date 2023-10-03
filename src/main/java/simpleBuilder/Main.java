package simpleBuilder;

public class Main {

	public static void main(String[] args) {
	
		Pancho pancho = new Pancho("Sin tacc", true, true, true);
		System.out.println(pancho + " \n \n");
		
		
		Pancho pancho2 = new Pancho();
		System.out.println(pancho2 + "\n\n");
		
		pancho2.addKetchup()
			.addMayonesa()
			.addPapas()
			.setPan("Pan de papa");
		
		System.out.println(pancho2);

	}
}


