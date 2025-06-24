package AtaqueCambios;

public class Player extends Entidad{

	public Player(int hp, int mp, int exp, int nivel, int daño) {
		super(hp, mp, exp, nivel, daño);
	}
	
	public String usarItem() {
		return "usé item";
	}
}
