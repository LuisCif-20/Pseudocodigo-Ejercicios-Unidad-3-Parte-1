import java.util.Scanner;
public class Ejercicio4{
	public static void main(String[] args) {
		int numero;
		int cuadrado;
		int cubo;
		Scanner num = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		numero = num.nextInt();
		cuadrado = numero*numero;
		cubo = numero*numero*numero;
		System.out.println("El cuadrado de " + numero + " es " + cuadrado + " y el cubo es " + cubo);
	}
}