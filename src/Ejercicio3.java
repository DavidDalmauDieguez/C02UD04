// Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int,
// dos variables N y M de tipo double y asigna a cada una un valor.
public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos las variables
		int X = 10;
		int Y = 5;
		double N = 1.2;
		double M = 4.5;
		// Creamos las variables de las operaciones
		double suma;
		double resta;
		double producto;
		double division;
		double resto;
		
		// Mostramos el valor de cada variable
		System.out.println("N = " + X + " Y = " + Y + " N = " + N + " M = " + M);		
		// Mostramos la suma de X y Y
		suma = X + Y;
		System.out.println("X + Y = " + suma);		
		// Mostramos la diferencia de X y Y
		resta = X - Y;
		System.out.println("X - Y = " + resta);		
		// Mosramos el producto de X y Y
		producto = X * Y;
		System.out.println("X * Y = " + producto);		
		// Mostramos el cociente de X y Y
		division = X / Y;
		System.out.println("X / Y = " +division);		
		// Mostramos el resto de la division de X y Y
		resto = X % Y;
		System.out.println("El resto de X / Y = " + resto);
		System.out.println("");
		// Mostramos la suma de  N y M
		suma = N + M;
		System.out.println("N + M = " + suma);		
		// Mostramos la diferencia de N y M
		resta = N - M;
		System.out.println("N - M = " + resta);		
		// Mosramos el producto de N y M
		producto = N * M;
		System.out.println("N * M = " + producto);		
		// Mostramos el cociente de N y M
		division = N / M;
		System.out.println("N / M = " +division);		
		// Mostramos el resto de la division de N y M
		resto = N % M;
		System.out.println("El resto de N / M = " + resto);
		System.out.println("");
		// Calculamos el doble de cada variable
		int dobleNumX = 2 * X;
		int dobleNumY = 2 * Y;
		double dobleNumN = 2 * N;
		double dobleNumM = 2 * M;
		System.out.println("Estos son los dobles: " );
		System.out.println("X = " + dobleNumX + " Y = " + dobleNumY + " N = " + dobleNumN + " M = " + M);
		System.out.println("");
		// Calculamos la suma de todas las variables
		double sumaTotal = X + Y + N + M;
		System.out.println("La suma total de las variables: ");
		System.out.println("X + Y + N + M = " + sumaTotal);
		System.out.println("");
		// Calculamos el producto de todas las variables
		double productoTotal = X * Y * N * M;
		System.out.println("El produto total de las variables");
		System.out.println("X * Y * N * M = " + productoTotal);
		
	}

}
