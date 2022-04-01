package Animais;

public class Animal implements AcoesAnimal {
	
public  Aves ave;
public Anfibios anfibio;
public Repteis reptel;
public Mamiferos mamifero;

public Animal() {
	super();
}

public Animal(Aves ave, Anfibios anfibio, Repteis reptel, Mamiferos mamifero) {
	super();
	this.ave = ave;
	this.anfibio = anfibio;
	this.reptel = reptel;
	this.mamifero = mamifero;
}


public Aves getAve() {
	return ave;
}

public Anfibios getAnfibio() {
	return anfibio;
}

public Repteis getReptel() {
	return reptel;
}

public Mamiferos getMamifero() {
	return mamifero;
}

public void setAve(Aves ave) {
	this.ave = ave;
}

public void setAnfibio(Anfibios anfibio) {
	this.anfibio = anfibio;
}

public void setReptel(Repteis reptel) {
	this.reptel = reptel;
}

public void setMamifero(Mamiferos mamifero) {
	this.mamifero = mamifero;
}

public String locomover() {
	if() {
		return "voar";
	}if()
}

@Override
public void alimentar() {
	
}

}
