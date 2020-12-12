package arreglos;

public class ArreglosEj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intArray[];
		int[] anotherIntArrary;
		
		short shortArray[];
		String stringArray[];
		
		stringArray = new String[5];
		
		stringArray[0] = "Cero";
		stringArray[1] = "Uno";
		stringArray[2] = "Dos";
		stringArray[3] = "Tres";
		stringArray[4] = "Cuatro";
		
//		System.out.println("Elemento: "+ stringArray[0]);
		
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println("Elemento "+ i + ":" + stringArray[0]);
		}
		
	}

}
