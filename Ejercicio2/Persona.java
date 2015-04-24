package Ejercicio2;

public class Persona {
	private String nombre;
	private int edad;
	private String calle;
	/**
	 * @param nombre
	 * @param edad
	 * @param calle
	 */
	public Persona(String nombre, int edad, String calle) {
		this.nombre = nombre;
		this.edad = edad;
		this.calle = calle;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", calle="
				+ calle + "]";
	}
	
	
}
