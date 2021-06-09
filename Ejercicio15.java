import java.util.Scanner;
public class Ejercicio15{
	public static void main(String[] args) {
		int numero;
		Scanner num = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		numero = num.nextInt();
		if (numero == 0) {
			System.out.println("El numero es nulo");
		} else {
			if (numero > 0) {
				System.out.println("El numero es positivo");
			} else {
				System.out.println("El numero es negativo");
			}
		}
	}
}