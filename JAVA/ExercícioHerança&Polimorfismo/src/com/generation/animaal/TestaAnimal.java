package com.generation.animaal;

import com.generation.animal.model.Cachorro;
import com.generation.animal.model.Cavalo;
import com.generation.animal.model.Preguiça;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro ("Tótó", 8, "Au au");
		c1.visualizar();
		c1.correr();
		c1.som();
	
		Cavalo c2 = new Cavalo ("Tenente", 8, "hiin in in ");
		c2.visualizar();
		c2.correr();
		c2.som();
		
		Preguiça p = new Preguiça ("Slow", 8, "");
		p.visualizar();
		p.subir();

	}

}
