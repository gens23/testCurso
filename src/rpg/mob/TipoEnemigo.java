package rpg.mob;

import java.util.EnumMap;
import java.util.Map;

import rpg.Entidad;
import rpg.player.enums.Atributos;

public enum TipoEnemigo {
	GOBLIN(
			new Mob(
					new EnumMap<>(Map.of(
						Atributos._HP, 70, 
						Atributos._MP, 10, 
						Atributos._STR, 7, 
						Atributos._INT, 2, 
						Atributos._DEX, 5, 
						Atributos._AGI, 5,
						Atributos._LVL, 1,
						Atributos._EXP, 100
					))
			)
	),
	GOLEM(
			new Mob(
					new EnumMap<>(Map.of(
						Atributos._HP, 120, 
						Atributos._MP, 20, 
						Atributos._STR, 15, 
						Atributos._INT, 2, 
						Atributos._DEX, 1, 
						Atributos._AGI, 2,
						Atributos._LVL, 1,
						Atributos._EXP, 160
					))
			)
	),
	SLIME(
			new Mob(
					new EnumMap<>(Map.of(
						Atributos._HP, 20, 
						Atributos._MP, 2, 
						Atributos._STR, 3, 
						Atributos._INT, 1, 
						Atributos._DEX, 5, 
						Atributos._AGI, 4,
						Atributos._LVL, 1,
						Atributos._EXP, 60
					))
			)
	),
	KOBOLD(
			new Mob(
					new EnumMap<>(Map.of(
							Atributos._HP, 1, 
							Atributos._MP, 2, 
							Atributos._STR, 3, 
							Atributos._INT, 4, 
							Atributos._DEX, 5, 
							Atributos._AGI, 6,
							Atributos._LVL, 1,
							Atributos._EXP, 100
					))
			)
	);
	
	private Mob mob;

	TipoEnemigo(Mob mob) {
		this.mob = mob;
	}

	public Mob crearInstancia() {
		return mob;
	}
	
	public static TipoEnemigo getAleatorio() {
		TipoEnemigo[] valores = values();
		int index = (int) (Math.random() * valores.length);
		System.out.println();
		return valores[index];
	}
}
