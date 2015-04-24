package Ejercicio2;

import java.util.List;

public class TestProfesor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListinProfesores lista=new ListinProfesores();
		Profesor pT1=new ProfesorTitular("Mio", 22, "Alguna", "Nolase", 22);
		Profesor pT2=new ProfesorTitular("Mio2", 22, "Alguna", "No2lase", 22);
		Profesor pI1=new ProfesorInterino("Interino",222, "Alguna", "ALguna");
		Profesor pI2=new ProfesorInterino("Interino2",222, "Alguna", "ALguna");
		lista.addProfesor(pI1);
		lista.addProfesor(pI2);
		lista.addProfesor(pT1);
		lista.addProfesor(pT2);
		System.out.println(lista);
		//Recorremos la lista para que nos de el nombre
		//Obtenemos el arraylist de profesores con el getter de la clase listin de profesores
		List<Profesor>listaAuxiliar=lista.getLista();
		for (Profesor profesor : listaAuxiliar) {
			System.out.printf("Nombre del profesor %s de edad %d y especialidad %s%n",
					profesor.getNombre(),profesor.getEdad(),profesor.getAsignatura());
			
		}
	}

}
