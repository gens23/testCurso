package rpg.arma;

public class Arma {
	private String nombre;
	private int _str;
	private int _dex;
	private int _int;
	private int _agi;
	private int _durabilidad;
	private int _desgaste;
	
	public Arma(String nombre, int _str, int _dex, int _int, int _agi, int _durabilidad, int _desgaste) {
		super();
		this.nombre = nombre;
		this._str = _str;
		this._dex = _dex;
		this._int = _int;
		this._agi = _agi;
		this._durabilidad = _durabilidad;
		this._desgaste = _desgaste;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int get_str() {
		return _str;
	}

	public int get_dex() {
		return _dex;
	}

	public int get_int() {
		return _int;
	}

	public int get_agi() {
		return _agi;
	}

	public int get_durabilidad() {
		return _durabilidad;
	}

	public int get_desgaste() {
		return _desgaste;
	}

	@Override
	public String toString() {
		return "Arma [nombre=" + nombre + ", _str=" + _str + ", _dex=" + _dex + ", _int=" + _int + ", _agi=" + _agi
				+ ", _durabilidad=" + _durabilidad + ", _desgaste=" + _desgaste + "]";
	}
	
	
}
