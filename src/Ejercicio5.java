// Programa java que delcare cuatro variables enteras A,B,C y D y asignale un valor a cada una
public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos las variables
		int A = 5;
		int B = 3;
		int C = 1;
		int D = 7;
		int AUX;
		
		// Creamos una auxiliar para guardar el numero
		AUX = B;
		// Cogemos B con el valor de C
		B = C;
		System.out.println("El primer valor es: " + B);
		// Cogemos C con el valor de A
		C = A;
		System.out.println("El segundo valor es: " + C);
		// Cogemos A con el valor de D
		A = D;
		System.out.println("El tercer valor es: " + A);
		// Cogemos D con el valor de AUX que es el mismo que B
		D = AUX;
		System.out.println("El cuarto valor es: " + D);
		
	}

}
