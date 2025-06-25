package mobs;

public class Entidad {
	private String nombre;
	private String tipoAtaque;
	private int hp;
	private int mp;
	private int nivel;
	private boolean estaVivo;
	private int daño;
	private int defensa;

	public Entidad(String nombre, int hp, int daño, int defensa, String tipoAtaque) {
		super();
		this.nombre = nombre;
		this.hp = hp;
		this.daño = daño;
		this.defensa = defensa;
		this.tipoAtaque = tipoAtaque;
		this.estaVivo = true;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoAtaque() {
		return tipoAtaque;
	}

	public void setTipoAtaque(String tipoAtaque) {
		this.tipoAtaque = tipoAtaque;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public boolean isEstaVivo() {
		return estaVivo;
	}

	public void setEstaVivo(boolean estaVivo) {
		this.estaVivo = estaVivo;
	}

	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	public void atacar(Entidad objetivo) {
        System.out.println(objetivo.getNombre() + " ataca con " + objetivo.getTipoAtaque() + " causando " + getDaño() + " de daño.");
    }
}
