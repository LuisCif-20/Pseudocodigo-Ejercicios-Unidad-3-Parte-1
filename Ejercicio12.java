import java.util.Scanner;
public class Ejercicio12{
	public static void main(String[] args) {
		double tempC;
		double tempF;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa una temperatura en grado Celcius");
		tempC = scan.nextDouble();
		tempF = (tempC*(9/5))+32;
		System.out.println("La temperatura en grado Fahrenheit es " + tempF);
	}
}