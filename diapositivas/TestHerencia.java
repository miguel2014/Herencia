package diapositivas;

public class TestHerencia {
	public static void main(String[] args) {
		//Siempre que creemos un objeto de la clase hija se crea uno de la clase padre
		Hija h=new Hija();	
	}
}
class Padre extends Prima{
	public Padre(){
		System.out.println("Creado objeto de la clase padre");
	}
}class Hija extends Padre{
	public Hija(){
		super();
		System.out.println("Creado objeto de la clase hija");		
	}
}	
class Prima {
	public Prima(){
		System.out.println("algo");
	}
}