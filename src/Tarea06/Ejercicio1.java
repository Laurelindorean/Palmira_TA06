/**
 * 
 */
package Tarea06;

/**
 * @author Palmira
 *
 */
public class Ejercicio1 {
	/*
	 * 1. Crea una aplicación que nos calcule el área de un circulo, cuadrado o
	 * triangulo. Pediremos que figura queremos calcular su área y según lo
	 * introducido pedirá los valores necesarios para calcular el área. Muestra el
	 * resultado por pantalla.
	 */
	public void pedirOpcion() {
		System.out.println("Que figura quieres que calcular su area?");
		String opcion = Utils.pedirString();
		double resultado;
		switch (opcion.toLowerCase()) {

		case "triangulo":
			System.out.println("Indica el la base: ");
			int base = Utils.pedirEntero();
			System.out.println("Indica la altura: ");
			int altura = Utils.pedirEntero();
			resultado = areaTriangulo(base, altura);
			System.out.println("El area del triangulo es : " + resultado);
			break;
		case "circulo":
			System.out.println("Indica el radio del Circulo:");
			int radio = Utils.pedirEntero();
			resultado = areaCirculo(radio);
			System.out.println("El area del circulo es: " + resultado);
			break;
		case "cuadrado":
			System.out.println("Indica el lado del Cuadrado:");
			int lado = Utils.pedirEntero();
			resultado = areaCuadrado(lado);
			System.out.println("El area del cuadrado es: " + resultado);
		}
	}

	public double areaCirculo(int radio) {
		double calculo = Math.PI * Math.pow(Double.valueOf(radio), 2);
		return calculo;
	}

	public double areaTriangulo(int base, int altura) {
		return (base * altura) / 2;
	}

	public double areaCuadrado(int lado) {
		return lado * lado;
	}
}
