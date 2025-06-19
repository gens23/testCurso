package prueba3.testArma;

public class Pico extends Arma implements Minar {

	public Pico(int base_daño, String tipo, String clase) {
		super(base_daño, tipo, clase);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void ataque() {
		System.out.println("Atacando con el Pico");
	}
	
	@Override
	public void minar() {
		System.out.println("Minando con el Pico");
		
	}
	
	@Override
	public int getBase_daño() {
		int base_daño = 5;
		return base_daño;
	}
}
