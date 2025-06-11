package prueba1;

public class EmpleadosGenerales {

	 private String nombre;
	    public int salarioBase= 3000;
	    private int edad;
	    
	    
	    public EmpleadosGenerales(String nombre, int edad){
	        
	        this.nombre = nombre;
	        this.edad= edad;
	        
	    }
	     public String getnombre (){
	         return nombre;
	     }
	     public int getsalarioBase (){
	         return salarioBase;
	     }
	     public int getedad (){
	         return edad;
	     }
	}
