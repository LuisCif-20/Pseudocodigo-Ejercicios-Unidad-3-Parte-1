import java.util.Scanner;
public class Ejercicio13{
	public static void main(String[] args) {
		double PI = 3.1416;
		double radio;
		double altura;
		double volumen;
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el radio");
		radio = dato.nextDouble();
		if (radio > 0) {
			System.out.println("Ingrese la altura");
			altura = dato.nextDouble();
			if (altura > 0) {
				volumen = PI*radio*altura;
				System.out.println("El volumen del cilindro es " + volumen);
			} else {
				System.out.println("La altura no es valida");
			}
		} else {
			System.out.println("El radio no es valido");
		}
	}
}