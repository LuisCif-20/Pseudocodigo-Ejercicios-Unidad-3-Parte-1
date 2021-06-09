import java.util.Scanner;
public class Ejercicio1{
	public static void main(String[] args){
		int numero1;
		int numero2;
		int resultado;
		Scanner numeros = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		numero1 = numeros.nextInt();
		System.out.println("Ingresa otro numero");
		numero2 = numeros.nextInt();
		resultado = numero1 + numero2;
		System.out.println("La suma de los dos numeros es " + resultado);
	}
}