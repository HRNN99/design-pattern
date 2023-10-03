package builder;

public class NotebookManual {
	
	private String brand;
	private Integer ram;
	private Integer proccesor;
	private Integer gpu;
	
	
	public NotebookManual() {
	}

	public NotebookManual(String brand, Integer ram, Integer proccesor, Integer gpu) {
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

	public NotebookManual setBrand(String brand) {
		this.brand = brand;
		return this;
	}

	public NotebookManual setRam(Integer ram) {
		this.ram = ram;
		return this;

	}

	public NotebookManual setProccesor(Integer proccesor) {
		this.proccesor = proccesor;
		return this;

	}

	public NotebookManual setGpu(Integer gpu) {
		this.gpu = gpu;
		return this;

	}

	@Override
	public String toString() {
		return "NotebookManual [brand=" + brand + ", ram=" + ram + ", proccesor=" + proccesor + ", gpu=" + gpu + "] \n\n  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore"
				+ "\n magna aliqua. Facilisis sed odio morbi quis commodo odio. Pellentesque habitant morbi tristique senectus."
				+ "\n Cursus risus at ultrices mi. Porttitor lacus luctus accumsan tortor posuere ac ut consequat."
				+ "\n Diam vel quam elementum pulvinar. Volutpat lacus laoreet non curabitur gravida arcu ac."
				+ "\n Feugiat in ante metus dictum at tempor commodo ullamcorper a. Mauris vitae ultricies leo integer."
				+ "\n Nulla porttitor massa id neque. Nisl vel pretium lectus quam. Justo eget magna fermentum iaculis eu non diam."
				+ "\n Ipsum dolor sit amet consectetur adipiscing elit. Erat velit scelerisque in dictum non consectetur."
				+ "\n Dictumst quisque sagittis purus sit amet. Mi eget mauris pharetra et ultrices."
				+ "\n Morbi tristique senectus et netus et malesuada fames ac. Tellus integer feugiat scelerisque varius."
				+ "\n Tortor id aliquet lectus proin nibh. Lorem sed risus ultricies tristique nulla.";
	}
	
	
	
}
