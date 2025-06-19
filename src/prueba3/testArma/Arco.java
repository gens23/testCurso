package prueba3.testArma;

public class Arco extends Arma {

	public Arco(int base_daño, String tipo, String clase) {
		super(base_daño, tipo, clase);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void ataque() {
		System.out.println("Disparando flecha");
	}
	
	@Override
	public int getBase_daño() {
		int base_daño = 7;
		return base_daño;
	}
}
