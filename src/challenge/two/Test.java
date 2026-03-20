package challenge.two;

public class Test {

	public static void main(String[] args) {
		Carrera carrera = new Carrera("Lic. En Sistemas", "Tecnologico y Productivo", "UNLA");

		Persona alumno = new Alumno("Nahuel", "Flores", 1111, "Calle falsa 123", carrera);
		Persona profesor = new Profesor("Profe", "Sor", 2222, "Falsa calle 456", carrera, carrera.getDepartamento());

		System.out.println("=== Challenge 02 ===");
		System.out.println("\nAlumno:");
		System.out.println(alumno);
		System.out.println("\nProfesor:");
		System.out.println(profesor);

		System.out.println("\nSaludos:");

		System.out.println(alumno.saludar());
		System.out.println(profesor.saludar());
		System.out.println(alumno.saludar("que quiere desearte exitos en tu carrera!"));
		System.out.println(profesor.saludar("que quiere informarte que aprobaste el examen."));
	}
}
