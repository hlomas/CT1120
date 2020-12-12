package clasesYObjetos;

public class DemoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo minivan= new Vehiculo();
		
		minivan.pasajeros = 6;
		minivan.capacidad = 10;
		minivan.kmh = 20;
		
		int rango = minivan.capacidad * minivan.kmh;
		System.out.println("Rango:" + rango);
	}

}
