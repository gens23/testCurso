package prueba3.testArma;

public class Espada extends Arma{

	public Espada(int base_daño, String tipo, String clase) {
		super(base_daño, tipo, clase);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void ataque() {
		System.out.println("Daño con la espada");
	}
	
	@Override
	public int getBase_daño() {
		int base_daño = 15;
		return base_daño;
	}
}
