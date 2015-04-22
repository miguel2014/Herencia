package Ejercicio1;

public class InformaticoAbs {
	private String empresa;
	private double sueldo;
	/**
	 * @param empresa
	 */
	public InformaticoAbs(String empresa) {
		this.empresa = empresa;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String nueva) {
		this.empresa = nueva;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double euros) {
		this.sueldo = euros;
	}
	public double pagarSueldo(double horas){
		return sueldo*horas;
	}
	@Override
	public String toString() {
		return "empresa=" + empresa + ", sueldo=" + sueldo;
	}
	
}
