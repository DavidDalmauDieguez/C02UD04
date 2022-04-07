// Escribe un programa que delcare una variable entera N y asignale un valor

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos las variables
		int N = 1;
		int incremento = 77;
		int decremento = 3;
		int duplicar = 2;
		int valorIncremento , valorDecremento, valorDuplicado;
		
		// Le incrementamos en 77
		valorIncremento = N + incremento;
		System.out.println("El incremento es = " + valorIncremento);
		// Le decrementamos en 3
		valorDecremento = valorIncremento - decremento;
		System.out.println("El decremento es = " + valorDecremento);
		// Le duplicamos en 2
		valorDuplicado = valorDecremento * duplicar;
		System.out.println("El valor duplicado es = " + valorDuplicado);
		
	}

}
