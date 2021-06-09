import java.util.Scanner;
public class Ejercicio11{
	public static void main(String[] args) {
		double magnitud;
		double yardas;
		double metros;
		double pies;
		double pulg;
		Scanner mag = new Scanner(System.in);
		System.out.println("Ingresa una magnitud en centimetros");
		magnitud = mag.nextDouble();
		yardas = magnitud*0.0109361;
		metros = magnitud/100;
		pies = magnitud*0.984252;
		pulg = magnitud/2.54;
		System.out.println(magnitud + " centimetros es equivalente a ");
		System.out.println(yardas + " yardas, " + metros + " metros, " + pies + " pies, " + pulg + " pulgadas.");
	}
}