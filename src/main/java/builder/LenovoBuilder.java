package builder;

public class LenovoBuilder implements NotebookBuilder{

	private Notebook notebook;
	
	public LenovoBuilder() {
		this.notebook = new Notebook();
	}
	
	@Override
	public void reset() {
		this.notebook = new Notebook();
		System.out.println("Reset Lenovo");
	}

	@Override
	public void setRamGb(Integer gb) {
		this.notebook.setRam(gb);
	}

	@Override
	public void setProccesorGb(Integer gb) {
		this.notebook.setProccesor(gb);
	}

	@Override
	public void setGpuGb(Integer gb) {
		this.notebook.setGpu(gb);
	}

	public Notebook getProduct() {
		this.notebook.setBrand("Lenovo");
		Notebook notebook = this.notebook;
		this.reset();
		return notebook;
	}


}
