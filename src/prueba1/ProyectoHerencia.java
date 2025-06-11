package prueba1;

import java.util.Scanner;

public class ProyectoHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Administrativos admi = new Administrativos("Victor",23);
        Tecnicos tec = new Tecnicos("Laura", 30);
        EmpleadosGenerales general = new EmpleadosGenerales("Sergio", 19);
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
                   System.out.println("\nAdministrativo ");
                   System.out.println("Nombre: " + admi.getnombre());
                   System.out.println("Edad: " + admi.getedad());
                   System.out.println("Salario calculado: $" + admi.calcularSalario());
                   System.out.println(" ");
                   break;
               case 2:
                   System.out.println("\nTecnico ");
                   System.out.println("Nombre: " + tec.getnombre());
                   System.out.println("Edad: " + tec.getedad());
                   System.out.print("Ingresa horas extra trabajadas: ");
                   int horas = Leer.nextInt();
                   System.out.println("Salario calculado: $" + tec.calcularSalario(horas));
                   break;
               case 3:
                   System.out.println("\nEmpleado General ");
                   System.out.println("Nombre: " + general.getnombre());
                   System.out.println("Edad: " + general.getedad());
                   System.out.println("Salario: $" + general.getsalarioBase());
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



