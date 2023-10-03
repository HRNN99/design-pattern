package builder;

public class Notebook {
	
	private String brand;
	private Integer ram;
	private Integer proccesor;
	private Integer gpu;
	
	
	public Notebook() {
	}

	public Notebook(String brand, Integer ram, Integer proccesor, Integer gpu) {
		this.brand = brand;
		this.ram = ram;
		this.proccesor = proccesor;
		this.gpu = gpu;
	}

	public String getBrand() {
		return brand;
	}

	public Integer getRam() {
		return ram;
	}

	public Integer getProccesor() {
		return proccesor;
	}

	public Integer getGpu() {
		return gpu;
	}

	public Notebook setBrand(String brand) {
		this.brand = brand;
		return this;
	}

	public Notebook setRam(Integer ram) {
		this.ram = ram;
		return this;
	}

	public Notebook setProccesor(Integer proccesor) {
		this.proccesor = proccesor;
		return this;

	}

	public Notebook setGpu(Integer gpu) {
		this.gpu = gpu;
		return this;

	}

	@Override
	public String toString() {
		return "Notebook [brand=" + brand + ", ram=" + ram + ", proccesor=" + proccesor + ", gpu=" + gpu + "]";
	}
	
	
	
}
