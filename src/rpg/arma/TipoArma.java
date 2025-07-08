package rpg.arma;

public enum TipoArma {
	ESPADA("Espada", 30, 5, 2, 2, 100, 20),
    ARCO("Arco", 20, 20, 3, 4, 100, 10),
    LANZA("Lanza", 20, 20, 3, 4, 100, 10),
	HACHA("Hacha", 20, 20, 3, 4, 100, 10),
	PICO("Pico", 20, 20, 3, 4, 100, 10);
	
	private String nombre;
	private int _str;
	private int _dex;
	private int _int;
	private int _agi;
	private int _durabilidad;
	private int _desgaste;
	
	TipoArma(String nombre, int _str, int _dex, int _int, int _agi, int _durabilidad, int _desgaste) {
		this.nombre = nombre;
		this._str = _str;
		this._dex = _dex;
		this._int = _int;
		this._agi = _agi;
		this._durabilidad = _durabilidad;
		this._desgaste = _desgaste;
	}
	
	public Arma crearInstancia() {
		return new Arma(nombre, _str, _dex, _int, _agi, _durabilidad, _desgaste);
	}
}
