package builder;

public class Director {
	
	public void buildLenovoModel100(NotebookBuilder builder) {
		
		builder.setRamGb(16);
		builder.setProccesorGb(2);
		builder.setGpuGb(2);
	}
	
	
	public void buildLenovoModel200(NotebookBuilder builder) {
	
		builder.setRamGb(32);
		builder.setProccesorGb(4);
		builder.setGpuGb(8);
	}
	
}
