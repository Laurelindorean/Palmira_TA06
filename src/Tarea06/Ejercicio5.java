/**
 * 
 */
package Tarea06;

/**
 * @author Palmira
 *
 */
public class Ejercicio5 {

	/* 5. Crea una aplicación que nos convierta un número en base decimal a binario. Esto lo 
	 * realiza un método al que le pasaremos el numero como parámetro, devolverá un String
	 * con el numero convertido a binario. Para convertir un numero decimal a binario, debemos dividir
	 * entre 2 el numero y el resultado de esa división se divide entre 2 de nuevo hasta que no se pueda 
	 * dividir más, el resto que obtengamos de cada división formara el numero binario, de abajo
	 * a arriba. 
	 */
	
	public void pedirNumero() {
		System.out.println("Di que numero quieres convertir a binario: ");
		int numero = Utils.pedirEntero();
		System.out.println("El codigo binario es " + numeroBinario(numero));
	}
	
	public String numeroBinario(int numero) {
		System.out.println("El numero es " + numero);
		int resto = 0;
		String binario = "";
		int i=0;
		while(numero>=2) {
			resto = numero%2;
			numero=numero/2;
			binario += Integer.toString(resto);
		}
		binario += Integer.toString(resto);
		//Invertimos la cadena de texto
		StringBuilder palabraReves = new StringBuilder(binario);
		binario = palabraReves.reverse().toString();
		return binario;
		
	}
}
