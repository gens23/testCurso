package prueba1;

import java.util.Scanner;

public class EmpleadosGenerales {

	Scanner Leer = new Scanner(System.in);
	
	private String nombre;
	private int edad;
	private int compensacion = 0;
	private int salarioBase = 2000;

	public EmpleadosGenerales(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getnombre() {
		return nombre;
	}

	public int getsalarioBase() {
		return salarioBase;
	}

	public int getedad() {
		return edad;
	}

	public int calcularSalario(int compensacion) {
		compensacion = this.compensacion;

		return getsalarioBase();
	}

	public void pagarEmpleado() {
		int compensacion = 0;

		if (this.getClass().getSimpleName().equals("Administrativos")) {
			compensacion = 2000;
		}
		String descripcion = "" + "\n " + this.getClass().getSimpleName() 
				+ "\n Nombre: " + this.getnombre()
				+ "\n Edad: " + this.getedad(); 
		
		if (this.getClass().getSimpleName().equals("Tecnicos")) {
			System.out.print("Ingresa horas extra trabajadas: ");
			compensacion = Leer.nextInt();
		}
		
		descripcion = descripcion +  "\nSalario calculado: $" + this.calcularSalario(compensacion);

		System.out.println(descripcion);
	}
}
