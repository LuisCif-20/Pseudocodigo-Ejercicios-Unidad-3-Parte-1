import java.util.Scanner;
public class Ejercicio3{
	public static void main(String[] args){
		int numero;
		int doble;
		int triple;
		Scanner num = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		numero = num.nextInt();
		doble = 2*numero;
		triple = 3*numero;
		System.out.println("El doble de " + numero + " es " + doble + " y el triple es " + triple);

	}
}