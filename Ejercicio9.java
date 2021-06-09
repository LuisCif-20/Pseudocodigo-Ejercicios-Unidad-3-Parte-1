import java.util.Scanner;
public class Ejercicio9{
	public static void main(String[] args) {
		int numero1;
		int numero2;
		int numero3;
		int resultado;
		Scanner num = new Scanner(System.in);
		System.out.println("Ingresa el primer numero");
		numero1 = num.nextInt();
		System.out.println("Ingresa el segundo numero");
		numero2 = num.nextInt();
		System.out.println("Ingresa el tercer numero");
		numero3 = num.nextInt();
		resultado = (numero1 + numero2 + numero3)/3;
		System.out.println("El promedio es " + resultado);
	}
}