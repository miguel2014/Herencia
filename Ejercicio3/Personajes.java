package Ejercicio3;

public class Personajes {
	private String nombre;
	private int nivelEnergia;
	/**
	 * @param nombre
	 * @param nivel
	 */
	public Personajes(String nombre, int nivel) {
		this.nombre = nombre;
		this.nivelEnergia = nivel;
	}
	//Metodo mutante cambia el valor de un atributo de Personaje
	//En este caso es el unico metodo que puede alterar el valor de la energia
	//pues esta definiada con visibilidad private
	//La otra opcion es poner protected el nivel de enrgia
	public void alimentarse(int energia){
		nivelEnergia+=energia;
	}
	public String getNombre() {
		return nombre;
	}
	public int getNivelEnergia() {
		return nivelEnergia;
	}
	@Override
	public String toString() {
		return "Personajes [nombre=" + nombre + ", nivelEnergia="
				+ nivelEnergia + "]";
	}
	
	
}
