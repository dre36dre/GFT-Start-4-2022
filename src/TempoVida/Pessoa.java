package TempoVida;

public class Pessoa {

	private String nome;
	private String sexo;
	private int dataDeNascimento;
	public Pessoa() {
		super();
	}
	public Pessoa(String nome, String sexo, int dataDeNascimento) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getNome() {
		return nome;
	}
	public String getSexo() {
		return sexo;
	}
	public int getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setDataDeNascimento(int dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public void tempoDeVidaRestante() {
		
	}
	
	
	
}
