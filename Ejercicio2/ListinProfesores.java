package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class ListinProfesores {
	//Va a contener una coleccion de objetos Profesor
	List<Profesor> lista;
	//Vamos a inicializar la lista como arraylist vacio;

	/**
	 * @param lista
	 */
	public ListinProfesores() {
		this.lista = new ArrayList<Profesor>();
	}
	//Metodo para añadir profesores
	public void addProfesor(Profesor p){
		lista.add(p);
	}
	public void deleteProfesor(Profesor p){
		lista.remove(p);
	}
	@Override
	public String toString() {
		return "ListinProfesores [lista=" + lista + "]";
	}
	public List<Profesor> getLista() {
		return lista;
	}
	
}
