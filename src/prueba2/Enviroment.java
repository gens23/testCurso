package prueba2;

public class Enviroment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Entidad e = new Entidad(1, 1, 1, 1, 1);
		Player p = new Player(1,1,1,1,1);
		
		System.out.println(e.getHp());
		System.out.println(p.getHp());
		
		
	}

}
