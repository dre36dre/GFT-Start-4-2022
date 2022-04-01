package Hardware;

import java.util.Scanner;

public class Hardware {

	private int id;
	private String descricao;
	private String fabricante;
	private double valor;
	
	Scanner entrada=new Scanner(System.in);
	
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
		System.out.println("Digite o id");
		id=entrada.nextInt();
		System.out.println("Descricao:");
		descricao=entrada.next();
		System.out.println("Fabricante");
		fabricante=entrada.next();
		System.out.println("Valor");
		valor=entrada.nextDouble();
		
	}


	@Override
	public String toString() {
		return "Hardware [id=" + id + ", descricao=" + descricao + ", fabricante=" + fabricante + ", valor=" + valor
				+ "]";
	}
	
	
	
	
	
	
}
