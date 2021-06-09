import java.util.Scanner;
public class Ejercicio18{
	public static void main(String[] args) {
		int numero;
		String num;
		int d1 = 0;
		int d2 = 0;
		int d3 = 0;
		int d4 = 0;
		int suma;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa un numero no mayor a 4 digitos");
		numero = scan.nextInt();
		if (numero > 9999) {
			System.out.println("El numero es mayor a 4 digitos");
		} else {
			num = numero+"";
			if (numero > 1000) {
				d1 = Integer.parseInt(num.substring(0,1));
				d2 = Integer.parseInt(num.substring(1,2));
				d3 = Integer.parseInt(num.substring(2,3));
				d4 = Integer.parseInt(num.substring(3,4));

			} else if (numero > 100) {
				d1 = 0;
				d2 = Integer.parseInt(num.substring(0,1));
				d3 = Integer.parseInt(num.substring(1,2));
				d4 = Integer.parseInt(num.substring(2,3));
			} else if (numero > 10) {
				d1 = 0;
				d2 = 0;
				d3 = Integer.parseInt(num.substring(0,1));
				d4 = Integer.parseInt(num.substring(1,2));
			} else {
				d1 = 0;
				d2 = 0;
				d3 = 0;
				d4 = numero;
			}
		}
		suma = d1 + d2 + d3 + d4;
		System.out.println("d1 = " + d1 + ", d2 = " + d2 + ", d3 = " + d3 + ", d4 = " + d4);
		System.out.println("La suma de sus digitos es " +  suma);
	}
}