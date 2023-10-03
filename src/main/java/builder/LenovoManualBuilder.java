package builder;

public class LenovoManualBuilder implements NotebookBuilder{

	private NotebookManual notebookManual;
	
	public LenovoManualBuilder() {
		this.notebookManual = new NotebookManual();
	}
	
	@Override
	public void reset() {
		this.notebookManual = new NotebookManual();
		System.out.println("Reset Lenovo Manual");
	}

	@Override
	public void setRamGb(Integer gb) {
		this.notebookManual.setRam(gb);
	}

	@Override
	public void setProccesorGb(Integer gb) {
		this.notebookManual.setProccesor(gb);
	}

	@Override
	public void setGpuGb(Integer gb) {
		this.notebookManual.setGpu(gb);
	}

	public NotebookManual getProduct() {
		this.notebookManual.setBrand("Lenovo");
		NotebookManual notebookManual = this.notebookManual;
		this.reset();
		return notebookManual;
	}

}
