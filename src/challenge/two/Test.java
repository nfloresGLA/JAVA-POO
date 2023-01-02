package challenge.two;

public class Test {

	public static void main(String[] args) {
		
		Carrera carrera = new Carrera("Lic. En Sistemas", "Tecnologico y Productivo", "UNLA");
		
		Persona alumno = new Alumno("Nahuel", "Flores", 1111, "Calle falsa 123", carrera);
		
		Persona profesor = new Profesor("Profe", "Sor", 2222, "Falsa calle 456", carrera, carrera.getDepartamento());
		
		System.out.println(alumno); 
		/* output:	
	 	Alumno [nombre=Nahuel, apellido=Flores, dni=1111, direccion=Calle falsa 123, 
	 	carrera=Carrera [nombre=Lic. En Sistemas, departamento=Tecnologico y Productivo, universidad=UNLA], asignaturas=[]]		
		*/
		
		System.out.println(profesor);		
		/* output:
		 Profesor [nombre=Profe, apellido=Sor, dni=2222, direccion=Falsa calle 456, 
		 carrera=Carrera [nombre=Lic. En Sistemas, departamento=Tecnologico y Productivo, universidad=UNLA], departamento=Tecnologico y Productivo] 
		 */
		
		System.out.println(alumno.saludar()); // output: Me llamo: Nahuel y soy un estudiante!!!
		System.out.println(profesor.saludar()); // output: Me llamo: Profe y soy un Profesor!!!
		
		System.out.println(alumno.saludar("que quiere desearte exitos en tu carrera!")); // output: Soy un estudiante que quiere desearte exitos en tu carrera!
		System.out.println(profesor.saludar("que quiere informarte que aprobaste el examen.")); // output: Soy un profesor que quiere informarte que aprobaste el examen.
	}

}
