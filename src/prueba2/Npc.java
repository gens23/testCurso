package prueba2;

import java.util.Random;

public class Npc extends Entidad {
	
	Random rn = new Random();
	
	private int probabilidad = 0;
	
	public Npc(int hp, int mp, int exp, int nivel, int daño) {
		super(hp, mp, exp, nivel, daño);
	}
	
}
