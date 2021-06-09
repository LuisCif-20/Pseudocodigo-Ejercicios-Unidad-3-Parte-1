import java.util.Scanner;
public class Ejercicio8{
	public static void main(String[] args) {
		String palabraA;
		String palabraB;
		String aux;
		Scanner palabra = new Scanner(System.in);
		System.out.println("Ingrese su primer palabra");
		palabraA = palabra.nextLine();
		System.out.println("Ingrese otra palabra");
		palabraB = palabra.nextLine();
		aux = palabraB;
		palabraB = palabraA;
		palabraA = aux;
		System.out.println("Las palabras son " + palabraA + " y " + palabraB);
	}
}