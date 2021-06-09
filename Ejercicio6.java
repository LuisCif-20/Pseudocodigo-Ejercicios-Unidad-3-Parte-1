import java.util.Random;
public class Ejercicio6{
	public static void main(String[] args) {
		int numero;
		int aumento;
		Random aleatorio = new Random();
		numero = aleatorio.nextInt(201);
		aumento = numero + (int)(numero*0.3);
		System.out.println("El numero es: " + numero);
		System.out.println("El numero aumentado un 30% es " + aumento);
	}
}