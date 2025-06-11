package prueba1;

public class Administrativos  extends EmpleadosGenerales{

	private int Bonomensual = 2000;

    public Administrativos(String nombre, int edad) {

        super(nombre, edad);
    }

    public int calcularSalario() {
        return getsalarioBase() + Bonomensual;
    }

}
