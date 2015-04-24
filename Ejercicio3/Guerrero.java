package Ejercicio3;

public class Guerrero extends Personajes{
	private String arma;

	/**
	 * @param nombre
	 * @param nivel
	 * @param arma
	 */
	public Guerrero(String nombre, int nivel, String arma) {
		super(nombre, nivel);
		this.arma = arma;
	}
	public String combatir(int energiaCombate){
		if(energiaCombate<=getNivelEnergia()){
			alimentarse(-energiaCombate);
			return this.arma+" "+ getNivelEnergia();
		}
		else
		return "Sin mana para combatir";
	}
	@Override
	public String toString() {
		return "Guerrero [arma=" + arma + " "+super.toString()+" ]";
	}
	
}
