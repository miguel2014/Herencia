package diapositivas;

import java.time.LocalDate;

public class TestVehiculos {
	public static void main(String[] args) {
		Vehiculo c=new Vehiculo("al", 22,3);
	}
}
class Vehiculo{
	private int numeroRuedas;
	private LocalDate fechaCompra;
	private String propietario;
	private int numeroPasajeros;
	/**
	 * @param numeroRuedas
	 * @param fechaCompra
	 */
	public Vehiculo(String propietario, int numeroRuedas,int numeroPasajeros) {
		this.numeroRuedas = numeroRuedas;
		this.fechaCompra = LocalDate.now();
		this.numeroPasajeros = numeroPasajeros;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public int getNumeroRuedas() {
		return numeroRuedas;
	}
	public LocalDate getFechaCompra() {
		return fechaCompra;
	}
	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}
	@Override
	public String toString() {
		return "Vehiculo [numeroRuedas=" + numeroRuedas + ", fechaCompra="
				+ fechaCompra + ", propietario=" + propietario
				+ ", numeroPasajeros=" + numeroPasajeros + "]";
	}
	
}
class Coche extends Vehiculo{
	private boolean diesel;
	private boolean descapotable;
	/**
	 * @param numeroRuedas
	 * @param fechaCompra
	 * @param numeroPasajeros
	 * @param diesel
	 * @param descapotable
	 */
	public Coche(String propietario, boolean diesel, boolean descapotable) {
		super(4,propietario);
		this.diesel = diesel;
		this.descapotable = descapotable;
	}
	@Override
	public String toString() {
		return "Coche [diesel=" + diesel + ", descapotable=" + descapotable
				+ ", Vehiculo" + super.toString() + "]";
	}
	
	
}