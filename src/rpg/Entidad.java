package rpg;

import java.util.Map;
import java.util.Random;

import rpg.player.enums.Atributos;

public class Entidad {
	Random rn = new Random();

	private Map<Atributos, Integer> atributos;
	private boolean estaVivo = true;

	public Entidad(Map<Atributos, Integer> atributos) {
		super();
		this.atributos = atributos;
	}

	public int getHp() {
		return this.atributos.get(Atributos._HP);
	}

	public void setHp(int hp) {
		int newHp = this.atributos.get(Atributos._HP) + hp;
		this.atributos.put(Atributos._HP, newHp);
	}

	public int getMp() {
		return this.atributos.get(Atributos._MP);
	}

	public void setMp(int mp) {
		int newMp = this.atributos.get(Atributos._MP) + mp;
		this.atributos.put(Atributos._MP, newMp);
	}
	
	public int getStr() {
		return this.atributos.get(Atributos._STR);
	}

	public void setStr(int str) {
		int newStr = this.atributos.get(Atributos._STR) + str;
		this.atributos.put(Atributos._STR, newStr);
	}
	
	public int getInt() {
		return this.atributos.get(Atributos._INT);
	}

	public void setInt(int _int) {
		int newInt = this.atributos.get(Atributos._INT) + _int;
		this.atributos.put(Atributos._INT, newInt);
	}

	public int getDex() {
		return this.atributos.get(Atributos._DEX);
	}

	public void setDex(int dex) {
		int newDex = this.atributos.get(Atributos._DEX) + dex;
		this.atributos.put(Atributos._DEX, newDex);
	}
	
	public int getAgi() {
		return this.atributos.get(Atributos._AGI);
	}

	public void setAgi(int agi) {
		int newAGI = this.atributos.get(Atributos._AGI) + agi;
		this.atributos.put(Atributos._AGI, newAGI);
	}
	
	public int getExp() {
		return this.atributos.get(Atributos._EXP);
	}

	public void setExp(int exp) {
		int newExp = this.atributos.get(Atributos._EXP) + exp;
		this.atributos.put(Atributos._EXP, newExp);
	}

	public int getNivel() {
		return this.atributos.get(Atributos._LVL);
	}

	public void setNivel(int nivel) {
		int newLvl = this.atributos.get(Atributos._LVL) + nivel;
		this.atributos.put(Atributos._LVL, newLvl);
	}

	public boolean isEstaVivo() {
		return estaVivo;
	}

	public void setEstaVivo(boolean estaVivo) {
		this.estaVivo = estaVivo;
	}

	public int getDaño() {
		int daño = this.atributos.get(Atributos._STR) * 2;
		return daño;
	}

	public void setDaño(int daño) {
		int newStr = this.atributos.get(Atributos._STR) + daño;
		this.atributos.put(Atributos._STR, newStr);
	}

	public void mover(int x, int y) {
		System.out.println("X: " + x + " Y: " + y);
	}

	public int dropeo() {
		System.out.println("Random \n");
		int probabilidad = rn.nextInt();
		return probabilidad;
	}

	public void atacar(Entidad objetivo) {
		if (this.estaVivo && objetivo.isEstaVivo()) {
			
			System.out.println(this.getClass().getSimpleName() + " tiene STR: " + this.getStr());
			
			System.out.println("atacando con " + ( this.getDaño() ) + " de daño");
			
			int nuevoHp = objetivo.getHp() - this.getDaño();
			
			objetivo.setHp(nuevoHp);
			
			System.out.println(objetivo.getClass().getSimpleName() +  " -> HP: " + ( objetivo.getHp() ) + " <-");
			
		}
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [atributos=" + atributos + ", estaVivo=" + estaVivo + "]";
	}
	
	
}
