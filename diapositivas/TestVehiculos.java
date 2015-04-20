package diapositivas;

import java.time.LocalDate;

public class TestVehiculos {
	public static void main(String[] args) {
		
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
	 * @param numeroPasajeros
	 */
	public Vehiculo(int numeroRuedas,
			int numeroPasajeros) {
		this.numeroRuedas = numeroRuedas;
		this.fechaCompra = LocalDate.now();
		this.propietario = propietario;
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
	 * @param fechaCompra
	 * @param propietario
	 * @param numeroPasajeros
	 * @param diesel
	 * @param descapotable
	 */
	public Coche(int numeroPasajeros, boolean diesel, boolean descapotable) {
		super(4, numeroPasajeros);
		this.diesel = diesel;
		this.descapotable = descapotable;
	}
	@Override
	public String toString() {
		return "Coche [diesel=" + diesel + ", descapotable=" + descapotable
				+ ", Vehiculo" + super.toString() + "]";
	}
	
	
}