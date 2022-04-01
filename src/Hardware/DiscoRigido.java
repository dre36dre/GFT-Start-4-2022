package Hardware;

public class DiscoRigido extends Hardware {
private int capacidade;
private int velocidade;
private String tipo;

public DiscoRigido() {
	super();
}
public DiscoRigido(int capacidade, int velocidade, String tipo) {
	super();
	this.capacidade = capacidade;
	this.velocidade = velocidade;
	this.tipo = tipo;
}
public int getCapacidade() {
	return capacidade;
}
public int getVelocidade() {
	return velocidade;
}
public String getTipo() {
	return tipo;
}
public void setCapacidade(int capacidade) {
	this.capacidade = capacidade;
}
public void setVelocidade(int velocidade) {
	this.velocidade = velocidade;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}


}
