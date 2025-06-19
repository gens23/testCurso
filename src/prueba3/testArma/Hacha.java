package prueba3.testArma;

public class Hacha extends Arma implements Talar {

	public Hacha(int base_daño, String tipo, String clase) {
		super(base_daño, tipo, clase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ataque() {
		System.out.println("Atacando con el hacha");
	}
	
	@Override
	public void talar() {
		System.out.println("Talando con el hacha");
	}
	
	@Override
	public int getBase_daño() {
		int base_daño = 10;
		return base_daño;
	}
}
