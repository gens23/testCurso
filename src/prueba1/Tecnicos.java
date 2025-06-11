package prueba1;

public class Tecnicos extends EmpleadosGenerales{

	private int pagoHoraExtra = 100;

    public Tecnicos(String nombre, int edad) {

        super(nombre, edad);
    }

    public int calcularSalario(int horasExtra) {
        return getsalarioBase() + (horasExtra * pagoHoraExtra);
    }
}
