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
	
	
	@Override
	public double pagarSueldo(double horas) {
		// TODO Auto-generated method stub
		return super.pagarSueldo(horas)+100;
	}


	@Override
	public String toString() {
		return "Analista [especialidad=" + especialidad + ", " +super.toString() +"]";
	}
	
	
}
