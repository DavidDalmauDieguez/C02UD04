// Escribe un programa de Jaa que realice lo siguiente: declarar una variable N de tipo int, 
// una ariable A de tipo double y una variable C de tipo char y asigna un valor a cada una.

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos las variables
		int N = 5;
		double A = 2.3;
		char C = 97;
		
		// Muestramos el valor de cada variable
		System.out.println("Valor N: " + N + " Valor A: " + A + " Valor C: " + C);
		// Mostramos la suma de N y A
		double suma = N + A;
		System.out.println("N + A = " + suma);
		// Mostramos la diferencia de A y N
		double resta = A - N;
		System.out.println("A - N = " + resta);
		// Mosramos el valor numerico al caracter que contiene C
		int valorCaracter = C;
		System.out.println("El valor de C = " + valorCaracter);
		
	}

}
