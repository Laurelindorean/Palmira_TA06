/**
 * 
 */
package tarea06;

/**
 * @author Palmira
 *
 */
public class Ejercicio7 {

	/*
	 * 7. Crea una aplicación que nos convierta una cantidad de euros introducida
	 * por teclado a otra moneda, estas pueden ser a dolares, yenes o libras. El
	 * método tendrá como parámetros, la cantidad de euros y la moneda a pasar que
	 * sera una cadena, este no devolverá ningún valor, mostrara un mensaje
	 * indicando el cambio (void).
	 */
	public static final double DOLAR = 1.28611;
	public static final double YEN = 129.852;
	public static final double LIBRA = 0.86;
	
	public void pedirOpcion() {
		
		System.out.println("Introduce la cantidad de euros que quieres cambiar: ");
		double euros = Utils.pedirReal();
		System.out.println("A que moneda los quieres cambiar: (dolar, yen o libra)");
		String moneda = Utils.pedirString();
		cambioMoneda(euros, moneda);
	}

	public void cambioMoneda(double euros, String moneda) {
		double resultado;
		switch (moneda.toLowerCase()) {
		case "dolar":
			resultado = euros * DOLAR;
			System.out.println("Son " + resultado + " dolares");
			break;
		case "yen":
			resultado = euros * YEN;
			System.out.println("Son " + resultado + " yenes");
			break;
		case "libra":
			resultado = euros * LIBRA;
			System.out.println("Son " + resultado + " libras");
			break;
		default:
			System.out.println("Error. Debes introducir: Dolar, Yen o Libra");
		}

	}

}
