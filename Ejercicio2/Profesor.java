package Ejercicio2;

public class Profesor extends Persona {
	private String asignatura;

	/**
	 * @param nombre
	 * @param edad
	 * @param calle
	 * @param asignatura
	 */
	public Profesor(String nombre, int edad, String calle, String asignatura) {
		super(nombre, edad, calle);
		this.asignatura = asignatura;
	}
	
	public String getAsignatura() {
		return asignatura;
	}

	@Override
	public String toString() {
		return "Profesor [asignatura=" + asignatura +" "+super.toString() +" ]";
	}
	
	
}
