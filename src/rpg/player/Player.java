package rpg.player;

import rpg.Entidad;

public class Player extends Entidad{

	@Override
	public String toString() {
		return "Player [getNombre()=" + getNombre() + ", getTipoAtaque()=" + getTipoAtaque() + ", getHp()=" + getHp()
				+ ", getMp()=" + getMp() + ", getNivel()=" + getNivel() + ", isEstaVivo()=" + isEstaVivo()
				+ ", getDaño()=" + getDaño() + ", getDefensa()=" + getDefensa() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Player(String nombre, int hp, int daño, int defensa, String tipoAtaque) {
		super(nombre, hp, daño, defensa, tipoAtaque);
		// TODO Auto-generated constructor stub
	}
	
}
