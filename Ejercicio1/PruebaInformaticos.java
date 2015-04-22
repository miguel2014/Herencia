package Ejercicio1;

public class PruebaInformaticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Analista a=new Analista("Empresa2", "Analiza");
		a.setSueldo(251);
		System.out.println(a);
		System.out.println(a.pagarSueldoAumentado(33));
		Programador p=new Programador("Empresa3", "Idioma");
		p.setSueldo(251);
		double pagado=p.pagarSueldo(33);
		System.out.println(p);
		System.out.println(pagado);
	}

}
