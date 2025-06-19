package prueba3.testArma;

public class Arma {
	private int base_daño = 0;
	private String tipo = "";
	private String clase = "";
	
	public Arma(int base_daño, String tipo, String clase) {
		super();
		this.base_daño = base_daño;
		this.tipo = tipo;
		this.clase = clase;
	}

	public int getBase_daño() {
		return base_daño;
	}
	
	public void ataque() {
		System.out.println("Ataque Genérico");
	}
}
