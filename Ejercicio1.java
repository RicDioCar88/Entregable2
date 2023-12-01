package U3.entregable;

import java.util.Arrays;

public class Ejercicio1 {

	public static void fill(int[] b) {
		for (int i = 0; i < b.length; i++) {
			b[i] = (int) (Math.random() * 100000);
		}
		System.out.println(Arrays.toString(b));
	}

	public static void main(String[] args) {
		int[] bombo1 = new int[1807];
		String[] premios = { "primero", "segundo", "tercero", "dosCuartos", "ochoQuintos", "pedreas" };
		

		int numerosPremiados = (int) (Math.random() * bombo1.length);
		System.out.println(numerosPremiados);
		fill(bombo1);

		for (int i = 0; i < bombo1.length; i++) {
			System.out.println(bombo1[i]+" asigna "+premios[(int) (Math.random()*premios.length)]);
		}
		
		/*for (int i = 0; i < bombo1.length; i++) {
			primero = (int) (Math.random() * bombo1.length);
			System.out.println("Primer premio asociado al numero: " + primero);
			do {
				segundo = (int) (Math.random() * bombo1.length);
				System.out.println("Segundo premio asociado al numero: " + segundo);
			} while (primero == segundo);
			do {
				tercero = (int) (Math.random() * bombo1.length);
				System.out.println("Tercer premio asociado al numero: " + tercero);
			} while (tercero == primero && tercero == segundo);
			do {
				dosCuartos = (int) (Math.random() * bombo1.length);
				System.out.println("Premio 2/4 asociado al numero: " + dosCuartos);
			} while (dosCuartos == primero && dosCuartos == segundo && dosCuartos == tercero);
			do {
				ochoQuintos = (int) (Math.random() * bombo1.length);
				System.out.println("Premio 8/5 asociado al numero: " + ochoQuintos);
			} while (ochoQuintos == primero && ochoQuintos == segundo && ochoQuintos == tercero
					&& ochoQuintos == dosCuartos);
			do {
				pedreas = (int) (Math.random() * bombo1.length);
			} while (pedreas == primero && pedreas == segundo && pedreas == tercero && pedreas == dosCuartos
					&& pedreas == ochoQuintos);
			break;
		}*/
		
		

		// int premio=1;


		/*
		 * switch(premio) { case 1:{ primero = (int)(Math.random()*balls.length);
		 * System.out.println("Primer premio asociado al numero: "+primero); } case 2:{
		 * do { segundo = (int)(Math.random()*balls.length);
		 * System.out.println("Segundo premio asociado al numero: "+segundo);
		 * }while(primero==segundo); } case 3:{ do { tercero =
		 * (int)(Math.random()*balls.length);
		 * System.out.println("Tercer premio asociado al numero: "+tercero);
		 * }while(tercero==primero && tercero==segundo); } case 4:{ do { dosCuartos =
		 * (int)(Math.random()*balls.length);
		 * System.out.println("Premio 2/4 asociado al numero: "+dosCuartos); } while
		 * (dosCuartos==primero && dosCuartos==segundo && dosCuartos==tercero); } case
		 * 5:{ do { ochoQuintos = (int)(Math.random()*balls.length);
		 * System.out.println("Premio 8/5 asociado al numero: "+ochoQuintos);
		 * }while(ochoQuintos==primero && ochoQuintos==segundo && ochoQuintos==tercero
		 * && ochoQuintos==dosCuartos); } default:{
		 * 
		 * System.out.println("Pedreas"); } }
		 */
	}

}
