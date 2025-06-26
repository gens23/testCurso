package prueba1;

public class Administrativos  extends EmpleadosGenerales{

    public Administrativos(String nombre, int edad) {

        super(nombre, edad);
    }
    
    @Override
    public int calcularSalario(int compensacion) {
    	// TODO Auto-generated method stub
    	return getsalarioBase() + compensacion;
    }
}
