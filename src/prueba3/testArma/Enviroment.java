package prueba3.testArma;

import java.util.ArrayList;
import java.util.List;

public class Enviroment {
	public static void main(String[] args) {
		
		
		Guerrero guerrero = new Guerrero("Jonh Wick");
		
		List<Arma> inventario = new ArrayList<>();
		
		inventario.add(new Espada(0, null, null));
		inventario.add(new Hacha(0, null, null));
		inventario.add(new Arco(0, null, null));
		inventario.add(new Pico(0, null, null));
		
		for(Arma arma : inventario) {
			guerrero.usarArma(arma);
		}
	}
}
