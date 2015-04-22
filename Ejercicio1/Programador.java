package Ejercicio1;

public class Programador extends InformaticoAbs {
	private String lenguaje;
	/**
	 * @param empresa
	 * @param lenguaje
	 */
	public Programador(String empresa, String lenguaje) {
		super(empresa);
		this.lenguaje = lenguaje;
	}
	public double pagarSueldo(double horas){
		return getSueldo()*horas;	
	}
	@Override
	public String toString() {
		return "Programador [lenguaje=" + lenguaje + ", "+super.toString()+ "]";
	}
	
}
