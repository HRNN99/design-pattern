package builder;

public class Main {

	public static void main(String[] args) {
	
		Director director = new Director();
		
		LenovoBuilder builderLenovo = new LenovoBuilder();
		LenovoManualBuilder builderLenovoManual = new LenovoManualBuilder();
		
		director.buildLenovoModel100(builderLenovo);
		director.buildLenovoModel100(builderLenovoManual);

		Notebook lenovoNotebook = builderLenovo.getProduct();
		NotebookManual lenovoNotebookManual = builderLenovoManual.getProduct();
		
		System.out.println("Generating lenovo notebook\n" + lenovoNotebook);
		
		System.out.println("\n\n\n");
		
		System.out.println("Generating lenovo manual\n" +  lenovoNotebookManual);
	}
}


