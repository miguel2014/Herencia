package Ejercicio3;

public class TestVideojuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personajes p1=new Guerrero("Enano", 500, "Hacha");
		Personajes p2=new Mago("Mago", "Magia");
		Guerrero p3=new Guerrero("Guerrero", 25, "Espada");
		
		System.out.println(p3 +"\n"+p3.combatir(20));
		//P1 es de la clase Personaje ,anque en tiempo de ejecucion 
		//se reserva espacio en memoria para un objeto de tipo Guerrero pero no se puede acceder al metodo 
		//combatir de Guerrero ,hay que hacer un casting hacia abajo (downcasting)
		System.out.println(((Guerrero) p1).combatir(25));
		System.out.println(p2);
		System.out.println(((Mago) p2).encantar());
		System.out.println("Energia del mago "+p2.getNivelEnergia());
	}

}
