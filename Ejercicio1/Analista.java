package Ejercicio1;

public class Analista extends InformaticoAbs{
	private String especialidad;

	/**
	 * @param empresa
	 * @param especialidad
	 */
	public Analista(String empresa, String especialidad) {
		super(empresa);
		this.especialidad = especialidad;
	}
	public double pagarSueldoAumentado(double horas){
		return (pagarSueldo(horas))+200;	
	}
	@Override
	public String toString() {
		return "Analista [especialidad=" + especialidad + ", " +super.toString() +"]";
	}
	
	
}
