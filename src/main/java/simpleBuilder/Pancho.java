package simpleBuilder;

public class Pancho {
	
	private String pan = "normal";
	private boolean ketchup = false;
	private boolean mayonesa = false;
	private boolean papas = false;
	
	public Pancho() {
		
	}
	public Pancho(String pan,
			boolean ketchup,
			boolean mayonesa,
			boolean papas) {
		this.pan = pan;
		this.ketchup = ketchup;
		this.mayonesa = mayonesa;
		this.papas = papas;
	}


	public Pancho setPan(String pan) {
		this.pan = pan;
		return this;
	}

	public Pancho addKetchup() {
		this.ketchup = true;
		return this;

	}

	public Pancho addMayonesa() {
		this.mayonesa = true;
		return this;

	}

	public Pancho addPapas() {
		this.papas = true;
		return this;

	}


	@Override
	public String toString() {
		return "Pancho [pan=" + pan + ",\n ketchup=" + ketchup + ",\n mayonesa=" + mayonesa + ",\n papas=" + papas + "]";
	}
	
	
}
