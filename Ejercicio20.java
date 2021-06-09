import java.util.Scanner;
public class Ejercicio20{
	public static void main(String[] args) {
		int numero;
		String num;
		int d1 = 0;
		int d2 = 0; 
		int d4 = 0;
		int d5 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa un numero de 5 digitos");
		numero = scan.nextInt();
		if (numero>99999 && numero < 10000) {
			System.out.println("No es lo que se le solicito");
		} else {
			num = numero+"";
			d1 = Integer.parseInt(num.substring(0,1));
			d2 = Integer.parseInt(num.substring(1,2));
			d4 = Integer.parseInt(num.substring(3,4));
			d5 = Integer.parseInt(num.substring(4,5));
		}
		if (d1 == d5 && d2 == d4) {
			System.out.println("Es capicua");
		} else {
			System.out.println("No es capicua");
		}
	}
}