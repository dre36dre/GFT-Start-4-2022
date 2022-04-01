package Hardware;

public class Memoria  extends Hardware {
private int frequencia;
private int capacidade;
private String tipo;
public Memoria() {
	super();
}
public Memoria(int frequencia, int capacidade, String tipo) {
	super();
	this.frequencia = frequencia;
	this.capacidade = capacidade;
	this.tipo = tipo;
}
public int getFrequencia() {
	return frequencia;
}
public int getCapacidade() {
	return capacidade;
}
public String getTipo() {
	return tipo;
}
public void setFrequencia(int frequencia) {
	this.frequencia = frequencia;
}
public void setCapacidade(int capacidade) {
	this.capacidade = capacidade;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}



	
}
