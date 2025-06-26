package prueba1;

import java.util.Scanner;

public class ProyectoHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpleadosGenerales general = new EmpleadosGenerales("Sergio", 19);
		EmpleadosGenerales admi = new Administrativos("Victor", 23);
		EmpleadosGenerales tec = new Tecnicos("Laura", 30);

		Scanner Leer = new Scanner(System.in);
		int eleccion;

		do {
			System.out.println(" ");
			System.out.println(" Menu de Empleados ");
			System.out.println("1. Ver datos de Administrativo");
			System.out.println("2. Ver datos de Tecnico");
			System.out.println("3. Ver datos de Empleado General");
			System.out.println("0. Salir");
			System.out.print("Elige una opcion: ");
			System.out.println(" ");
			eleccion = Leer.nextInt();

			switch (eleccion) {
			case 1:
				admi.pagarEmpleado();
				break;
			case 2:
				tec.pagarEmpleado();
				break;
			case 3:
				general.pagarEmpleado();
				break;
			case 0:
				System.out.println("Saliste del sistema");
				break;
			default:
				System.out.println("Opcion invalida.");
				break;
			}

		} while (eleccion != 0);

	}
}
