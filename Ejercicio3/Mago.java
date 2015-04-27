package Ejercicio3;

public class Mago extends Personajes {
	private String poder;

	/**
	 * @param nombre
	 * @param nivel
	 * @param poder
	 */
	public Mago(String nombre, String poder) {
		super(nombre, 100);
		this.poder = poder;
	}
	public String encantar(){
		if(getNivelEnergia()>=2){
			alimentarse(-2);
			return this.poder;	
		}
		else{
			return "Sin energia para combatir";
		}
	}
	@Override
	public String toString() {
		return "Mago [poder=" + poder + " "+super.toString()+" ]";
	}
	
}
