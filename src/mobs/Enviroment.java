package mobs;

public class Enviroment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entidad player = new Player("PJ Test", 100, 10, 30, "Estoque");
		
		TipoEnemigo tipoAleatorio = TipoEnemigo.getAleatorio();
		
		Entidad enemigo = tipoAleatorio.crearInstancia();
		
		player.atacar(enemigo);
		enemigo.atacar(player);
		
	}

}
