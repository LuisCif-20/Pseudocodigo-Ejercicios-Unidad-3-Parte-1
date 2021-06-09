import java.util.Scanner;
public class Ejercicio14{
	public static void main(String[] args) {
		int numero;
		int numero1;
		int residuo;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		numero = scan.nextInt();
		System.out.println("Ingrese otro numero");
		numero1 = scan.nextInt();
		residuo = numero1%numero;
		if (residuo == 0) {
			System.out.println("Si es divisible");
		} else {
			System.out.println("No es divisible");
		}
	}
}