package pruebadaño;

import java.util.Random;

public class Enemy extends Entidad {

	Random rn = new Random();
	
	private int probabilidad = 0;
	
	public Enemy(int hp, int mp, int exp, int nivel, int daño) {
		super(hp, mp, exp, nivel, daño);
	}
	
	@Override
	public int dropeo() {
		
		int tipo = 2;
		int aumentaProbabilidadDeDrop = 1;
		
		if(tipo == 2) {
			
			aumentaProbabilidadDeDrop = 20;
		}
		
		return aumentaProbabilidadDeDrop;
	}
}
