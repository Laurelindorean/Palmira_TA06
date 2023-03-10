/**
 * 
 */
package Tarea06;

/**
 * @author Palmira
 *
 */
public class MainApp {

	public static void main(String[] args) {

		System.out.println("Que ejercicio quieres corregir ?");
		int opcion = Utils.pedirEntero();
		switch (opcion) {
		case 1:
			Ejercicio1 ej1 = new Ejercicio1();
			ej1.pedirOpcion();
			break;
		case 2:
			Ejercicio2 ej2 = new Ejercicio2();
			ej2.numerosAleatorios();
			break;
		case 3:
			Ejercicio3 ej3 = new Ejercicio3();
			ej3.numeroPrimo();
			break;
		case 4:
			Ejercicio4 ej4 = new Ejercicio4();
			ej4.pedirFactorial();
			break;
		case 5:
			Ejercicio5 ej5 = new Ejercicio5();
			ej5.pedirNumero();
			break;
		case 6:
			Ejercicio6 ej6 = new Ejercicio6();
			ej6.pedirNumero();
			break;
		}

	}

}
