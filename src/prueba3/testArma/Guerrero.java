package prueba3.testArma;

public class Guerrero {
	String nombre = "";

	public Guerrero(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void usarArma(Arma arma) {
		System.out.println("----------------------");
		System.out.println(arma.getClass());
		System.out.println(arma.getBase_daño());
		System.out.println();	
		
		if (arma instanceof Talar) {
		    ((Talar) arma).talar();
		}
		if (arma instanceof Minar) {
		    ((Minar) arma).minar();
		}
		arma.ataque();
	}
	
}
