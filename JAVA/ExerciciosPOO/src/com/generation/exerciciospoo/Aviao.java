package com.generation.exerciciospoo;

public class Aviao {

	/*2) Crie uma classe avião e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto avião, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/	
	
		
		private String modelo;
		private String cor;
		private int numPassageiros;
		
		public Aviao (String modelo, String cor, int numPassageiros) {
			this.modelo = modelo;
			this.cor = cor;
			this.numPassageiros = numPassageiros;	
		
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

		public int getNumPassageiros() {
			return numPassageiros;
		}

		public void setNumPassageiros(int numPassageiros) {
			this.numPassageiros = numPassageiros;
		}
		
		public void visualizar() {
			System.out.println("\nModelo do avião : " +this.modelo);
			System.out.println("\nCor do avião : " +this.cor);
			System.out.println("\nCapacidade de passageiros : " +this.numPassageiros);
			
			
		}
		

		
		
		
		
		
		

		
		
		
	}

