package rpg.core;

import java.util.EnumMap;
import java.util.Map;

import rpg.Entidad;
import rpg.player.Player;
import rpg.player.enums.Atributos;
import rpg.mob.TipoEnemigo;

public class Enviroment {
	public static void main(String[] args) {
		
		Map<Atributos, Integer> atributos = new EnumMap<>(Atributos.class);
		
		atributos.put(Atributos._STR, 2);
		atributos.put(Atributos._AGI, 4);
		atributos.put(Atributos._DEX, 6);
		atributos.put(Atributos._INT, 8);
		
		Entidad player = new Player(atributos);
		
		System.out.println("Información actual Player: \n" + player.toString());
		
		System.out.println("________________________________________________________");
		
		Entidad victima = TipoEnemigo.getAleatorio().crearInstancia();
		
		System.out.println("Información actual Enemy: \n" + victima.toString());
		
		player.atacar(victima);
		
		System.out.println("Nueva información Player: ");
		
		System.out.println(player.toString());
		
	}
}
