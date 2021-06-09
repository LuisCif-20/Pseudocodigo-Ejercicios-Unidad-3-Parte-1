import java.util.Scanner;
public class Ejercicio5{
	public static void main(String[] args) {
		int numero;
		int siguiente;
		Scanner num = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		numero = num.nextInt();
		siguiente = numero+1;
		System.out.println("El siguiente numero es " + siguiente);
	}
}