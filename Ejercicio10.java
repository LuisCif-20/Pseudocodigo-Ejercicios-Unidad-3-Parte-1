import java.util.Scanner;
public class Ejercicio10{
	public static void main(String[] args) {
		int altura;
		int base;
		int perimetro;
		int area;
		Scanner num = new Scanner(System.in);
		System.out.println("Ingrese la base");
		base = num.nextInt();
		System.out.println("Ingrese la altura");
		altura = num.nextInt();
		perimetro = 2*base + 2*altura;
		area = base*altura;
		System.out.println("El perimetro es " + perimetro);
		System.out.println("El area es " + area);
	}
}