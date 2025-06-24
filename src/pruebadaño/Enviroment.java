package pruebadaño;

public class Enviroment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Entidad entidad = new Entidad(0, 0, 0, 0, 0);
		
		Entidad player = new Player(50,20,0,1,10);
		
		Entidad enemy = new Enemy(0, 0, 0, 0, 0);
		
		Entidad npc = new Npc(0, 0, 0, 0, 0);
		
		System.out.println("DROPEO: \nentidad " + entidad.dropeo() + "\n Enemy " + enemy.dropeo() + "\n NPC " + npc.dropeo());
		
		
		System.out.println("Ataque al enemigo");
		player.atacar(enemy);
	}

}
