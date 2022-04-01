package Hardware;

public class Cpu  extends Hardware {

	private int clock;
	private String modelo;
	public Cpu() {
		super();
	}
	public Cpu(int clock, String modelo) {
		super();
		this.clock = clock;
		this.modelo = modelo;
	}
	public int getClock() {
		return clock;
	}
	public String getModelo() {
		return modelo;
	}
	public void setClock(int clock) {
		this.clock = clock;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
