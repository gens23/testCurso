package rpg.core;

import rpg.Entidad;
import rpg.arma.Arma;
import rpg.arma.TipoArma;
import rpg.player.Guerrero;
import rpg.player.Player;
import rpg.mob.Mob;
import rpg.mob.TipoEnemigo;
import rpg.npc.Npc;

public class Enviroment {
	public static void main(String[] args) {
		
		Arma arma = TipoArma.LANZA.crearInstancia();
		
		Entidad player = new Player("PJ Test", 100, arma.get_str(), 30, arma.getNombre());
		
		player.usarArma(arma);
		
		Entidad entidad = TipoEnemigo.SLIME.crearInstancia();
		
		Entidad enemigo = TipoEnemigo.getAleatorio().crearInstancia();
		
		player.atacar(enemigo);
		
		enemigo.atacar(player);
		
		player.setNivel(10);
		
		System.out.println(player.toString());
		
		if(player.getNivel() >= 10) {
			player = new Guerrero("Guerrero", 200, 1000, 2000, "Boludo");
		}
		
		System.out.println(player.toString());
	}
}
