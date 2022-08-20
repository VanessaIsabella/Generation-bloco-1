package com.generation.animaal;

import com.generation.animal.model.Cachorro;
import com.generation.animal.model.Cavalo;
import com.generation.animal.model.Pregui�a;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro ("T�t�", 8, "Au au");
		c1.visualizar();
		c1.correr();
		c1.som();
	
		Cavalo c2 = new Cavalo ("Tenente", 8, "hiin in in ");
		c2.visualizar();
		c2.correr();
		c2.som();
		
		Pregui�a p = new Pregui�a ("Slow", 8, "");
		p.visualizar();
		p.subir();

	}

}
