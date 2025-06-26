package prueba1;

public class Tecnicos extends EmpleadosGenerales {

	private int pagoHoraExtra = 100;

    public Tecnicos(String nombre, int edad) {

        super(nombre, edad);
    }
    
    @Override
    public int calcularSalario(int compensacion) {
    	// TODO Auto-generated method stub
    	return getsalarioBase() + (compensacion * pagoHoraExtra);
    }
}
