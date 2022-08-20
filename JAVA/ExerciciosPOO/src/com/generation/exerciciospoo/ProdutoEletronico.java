package com.generation.exerciciospoo;

public class ProdutoEletronico {


/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/
		
		private String modelo;
		private String cor;
		private float tamanho;
		private float RAM;

public ProdutoEletronico(String modelo, String cor, float tamanho, float rAM) {
	super();
	this.modelo = modelo;
	this.cor = cor;
	this.tamanho = tamanho;
	RAM = rAM;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}

public float getTamanho() {
	return tamanho;
}

public void setTamanho(float tamanho) {
	this.tamanho = tamanho;
}

public float getRAM() {
	return RAM;
}

public void setRAM(float rAM) {
	RAM = rAM;
}
		
public void visualizar() {
	System.out.println("\nO modelo do notebook é: " +this.modelo);
	System.out.println("\nA cor do notebook é : " +this.cor);
	System.out.println("\nO tamanho em polegadas do notebook é: " +this.tamanho);
	System.out.println("A memória RAM do notebook é : " +this.RAM);
}
			

	}


