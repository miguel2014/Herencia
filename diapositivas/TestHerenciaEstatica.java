package diapositivas;

public class TestHerenciaEstatica {
	public static void main(String[] args) {
		int valor=EstaticaHija.getValor();
		System.out.println(valor);
		int valorpadre=EstaticaPadre.getValor();
		System.out.println(valorpadre);
	}
}
class EstaticaPadre{
	//Protected me permite dar visibilidad en las clases hijas
	protected static int valor=0;
	public static int getValor(){
		return ++valor;
	}
}
class EstaticaHija extends EstaticaPadre{
	public static int getValor(){
		return valor+2;
	}
	
}