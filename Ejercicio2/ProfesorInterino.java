package Ejercicio2;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {
	private LocalDate inicioContrato;

	/**
	 * @param nombre
	 * @param edad
	 * @param calle
	 * @param asignatura
	 * @param inicioContrato
	 */
	public ProfesorInterino(String nombre, int edad, String calle,
			String asignatura) {
		super(nombre, edad, calle, asignatura);
		this.inicioContrato = LocalDate.now();
	}

	@Override
	public String toString() {
		return "ProfesorInterino [inicioContrato=" + inicioContrato+" "+super.toString() +" ]";
	}
	
	
}
