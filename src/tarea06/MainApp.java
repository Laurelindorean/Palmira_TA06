/**
 * 
 */
package tarea06;

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
		case 7:
			Ejercicio7 ej7 = new Ejercicio7();
			ej7.pedirOpcion();
			break;
		case 8:
			Ejercicio8 ej8 = new Ejercicio8();
			ej8.pedirValores();
			break;
		case 9:
			Ejercicio9 ej9 = new Ejercicio9();
			ej9.pedirArray();
			break;
		case 10:
			Ejercicio10 ej10 = new Ejercicio10();
			ej10.pedirArray();
			break;
		case 11:
			Ejercicio11 ej11 = new Ejercicio11();
			ej11.arrayRandom();
			break;
		case 12:
			Ejercicio12 ej12 = new Ejercicio12();
			ej12.generarArray();
			break;
		default:
			System.out.println("Error. Debes introducir un número del 1-12");

		}

	}

}
