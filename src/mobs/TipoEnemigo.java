package mobs;

public enum TipoEnemigo {
    GOBLIN("Goblin", 30, 5, 2, "daga oxidada"),
    GOLEM("Golem", 120, 20, 15, "puñetazo de roca"),
    SLIME("Slime", 15, 3, 1, "salpicón ácido"),
	KOBOLD("Kobold", 40,4,1,"ataque con pico");

    private final String nombre;
    private final int hp;
    private final int fuerza;
    private final int defensa;
    private final String tipoAtaque;

    TipoEnemigo(String nombre, int hp, int fuerza, int defensa, String tipoAtaque) {
        this.nombre = nombre;
        this.hp = hp;
        this.fuerza = fuerza;
        this.defensa = defensa;
        this.tipoAtaque = tipoAtaque;
    }

    public Enemigo crearInstancia() {
        return new Enemigo(nombre, hp, fuerza, defensa, tipoAtaque);
    }

    
    public static TipoEnemigo getAleatorio() {
        TipoEnemigo[] valores = values();
        int index = (int)(Math.random() * valores.length);
        System.out.println();
        return valores[index];
    }
}
