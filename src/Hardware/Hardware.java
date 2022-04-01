package Hardware;

public class Hardware {

	private int id;
	private String descricao;
	private String fabricante;
	private double valor;
	
	
	public Hardware() {
		super();
	}


	public Hardware(int id, String descricao, String fabricante, double valor) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.fabricante = fabricante;
		this.valor = valor;
	}


	public int getId() {
		return id;
	}


	public String getDescricao() {
		return descricao;
	}


	public String getFabricante() {
		return fabricante;
	}


	public double getValor() {
		return valor;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public void getDetalhesHardware() {
		
	}
	
	
}
