package factory;

public class Main {

	public static void main(String[] args) {
				
		Operation op = OpFactory.doOperation('*');
		
		Double res = op.execute(2.0, 4.4);
		
		System.out.printf("\n\n\nResultado: %.2f\n\n\n", res);
	}
}


