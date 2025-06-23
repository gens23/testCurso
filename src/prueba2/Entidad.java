package prueba2;

import java.util.Random;

public class Entidad {
	Random rn = new Random();
	
	private int hp = 0;
	private int mp = 0;
	private int exp = 0;
	private int nivel = 0;
	private boolean estaVivo = true;
	private int daño = 0;
	
		
			
	public Entidad(int hp, int mp, int exp, int nivel, int daño) {
		super();
		this.hp = hp;
		this.mp = mp;
		this.exp = exp;
		this.nivel = nivel;
		this.daño = daño;
		this.estaVivo = true;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public boolean isEstaVivo() {
		return estaVivo;
	}

	public void setEstaVivo(boolean estaVivo) {
		this.estaVivo = estaVivo;
	}

	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}
	
	public void mover(int x, int y) {
		System.out.println("X: " + x + " Y: " + y);
	}
	
	public int dropeo() {
		System.out.println("Random \n");
		int probabilidad = rn.nextInt();
		return probabilidad;
	}
	
	public void atacar (Enemy objetivo) {
		 if (this.estaVivo && objetivo.isEstaVivo()) {
		System.out.println("atacando con " + this.daño + "de dano");
		 int nuevoHp = objetivo.getHp() - this.daño;
	}
	
	
	
	}
	
}
	

