package Ejercicio2;

public class ProfesorTitular extends Profesor {
	private int antiguedad;

	/**
	 * @param nombre
	 * @param edad
	 * @param calle
	 * @param asignatura
	 * @param antiguedad
	 */
	public ProfesorTitular(String nombre, int edad, String calle,
			String asignatura, int antiguedad) {
		super(nombre, edad, calle, asignatura);
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "ProfesorTitular [antiguedad=" + antiguedad +" "+super.toString() +" ]";
	}
	
	
}
