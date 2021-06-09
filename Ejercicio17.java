import java.util.Scanner;
public class Ejercicio17{
	public static void main(String[] args) {
		int lado1;
		int lado2;
		int lado3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el primer lado del triangulo");
		lado1 = scan.nextInt();
		System.out.println("Ingrese el segundo lado");
		lado2 = scan.nextInt();
		System.out.println("Ingrese el tercer lado");
		lado3 = scan.nextInt();
		if (lado1 == lado2) {
			if (lado1 == lado3) {
				System.out.println("El triangulo es equilatero");
			} else {
				System.out.println("El triangulo es isoceles");
			}
		} else {
			if (lado1 == lado3) {
				System.out.println("El triangulo es iscoles");
			} else {
				System.out.println("El triangulo es escaleno");
			}
		}
	}
}