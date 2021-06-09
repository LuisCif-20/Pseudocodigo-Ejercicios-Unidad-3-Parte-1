import java.util.Scanner;
public class Ejercicio16{
	public static void main(String[] args) {
		int numero1;
		int numero2;
		int numero3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		numero1 = scan.nextInt();
		System.out.println("Ingrese otro numero");
		numero2 = scan.nextInt();
		System.out.println("Ingrese un ultimo numero");
		numero3 = scan.nextInt();
		if (numero1 > numero2) {
			if (numero1 > numero3) {
				System.out.println("El numero mayor es " + numero1);
			} else {
				System.out.println("El numero mayor es " + numero3);
			}
		} else {
			if (numero2 > numero3) {
				System.out.println("El numero mayor es " + numero2);
			} else {
				System.out.println("El numero mayor es " + numero3);
			}
		}
	}
}