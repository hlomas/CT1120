package herencia;

public class Lados3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo tri = new  Triangulo();
		tri.altura = 2;
		tri.base = 5;
		tri.estilo = "Equilatero";
		tri.mostrar();
		double elArea = tri.area();
		System.out.println(elArea);
		System.out.println(tri.getAltura());
	}

}
