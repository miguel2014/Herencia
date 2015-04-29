package diapositivas;

import java.time.LocalDate;

public class TestVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche c1 = new Coche(7, true, false);
		Coche c2 = new Coche(4, false, true);
		c1.setPropietario("Joaquin García");
		c2.setPropietario("Juan Frenedoso");
		Motocicleta m1 = new Motocicleta(250);
		m1.setPropietario("Luisa Jiménez");
		Motocicleta m2 = new Motocicleta(500);
		m2.setPropietario("Jose Luis Mesa");
		System.out.println(c1+"\n"+c2+"\n"+m1+"\n"+m2);

	}

}
class Vehiculo{
	//atributos de la clase padre
	private int numeroRuedas;
	private LocalDate fechaCompra;
	private String propietario;
	private int numeroPasajeros;
	/**
	 * @param numeroRuedas
	 * @param fechaCompra
	 * @param numeroPasajeros
	 */
	//constructor que inicializa los atributos de la clase padre
	//que la fecha de compra coincide con la fecha de creación del objeto
	public Vehiculo(int numeroRuedas,  int numeroPasajeros) {
		this.numeroRuedas = numeroRuedas;
		this.fechaCompra = LocalDate.now(); //fecha actual
		this.numeroPasajeros = numeroPasajeros;
	}
	/**
	 * @return the propietario
	 */
	public String getPropietario() {
		return propietario;
	}
	/**
	 * @param propietario the propietario to set
	 */
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	/**
	 * @return the numeroRuedas
	 */
	public int getNumeroRuedas() {
		return numeroRuedas;
	}
	/**
	 * @return the fechaCompra
	 */
	public LocalDate getFechaCompra() {
		return fechaCompra;
	}
	/**
	 * @return the numeroPasajeros
	 */
	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
		@Override
	public String toString() {
		return "Vehiculo [numeroRuedas=" + numeroRuedas + ", fechaCompra="
				+ fechaCompra + ", propietario=" + propietario
				+ ", numeroPasajeros=" + numeroPasajeros + "]";
	}
}
class Coche extends Vehiculo{
	//atributos propios de la clase Coche
	private boolean diesel;
	private boolean descapotable;
	/**
	 * @param numeroRuedas
	 * @param fechaCompra
	 * @param numeroPasajeros
	 * @param diesel
	 * @param descapotable
	 */
	public Coche(  int numeroPasajeros,	boolean diesel, boolean descapotable) {
		super(4,  numeroPasajeros); //inicializa los atributos de la clase padre
		//inicializamos los atributos de la clase hija Coche
		this.diesel = diesel; 
		this.descapotable = descapotable;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	//sobreescribimos el toString de la clase Object, pero aprovechamos
	//el toString sobreescrito de la clase Vehiculo
	@Override
	public String toString() {
		return "Coche [diesel=" + diesel + ", descapotable=" + descapotable
				 +" "+ super.toString() + "]";
	}
}
//idem para Motocicleta
class Motocicleta extends Vehiculo{
	private int cilindrada;

	/**
	 * @param numeroRuedas
	 * @param numeroPasajeros
	 * @param cilindrada
	 */
	public Motocicleta(int cilindrada) {
		super(2, 2);  //inicializamos atributos de la clase Vehiculo
		this.cilindrada = cilindrada; //inicializamos atributos de la clase Motocicleta
	}
//sobreescritura del toString similar a la sobreescritura de la clase Coche
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Motocicleta [cilindrada=" + cilindrada +" "+ super.toString() + "]";
	}
	
}
