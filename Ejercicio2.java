package U3.entregable;

public class Ejercicio2 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// Un palindromo es una cadena que se puede leer de la misma forma en ambos sentidos, 
		//por ejemplo, “Dábale arroz a la zorra el abad”. Implementa un algoritmo que indique 
		//si una determinada cadena de entrada es o no un palindromo.
		
		String cadena1="allsdlla";
		StringBuilder cad1=new StringBuilder(cadena1);

		
		StringBuilder cadena2;
		cadena2= cad1.reverse();
		
		System.out.println(cadena1);
		
		
		
		if(cadena1.equals(cadena2.toString())) {
			System.out.println("es un palindromo");
		}else {
			System.out.println("No es un palindromo");
		}
		
		
		
	}

}
