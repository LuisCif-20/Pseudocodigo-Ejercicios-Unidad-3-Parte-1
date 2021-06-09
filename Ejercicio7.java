import java.util.Random;
public class Ejercicio7{
	public static void main(String[] args) {
		int numero;
		int reducir;
		Random aleatorio = new Random();
		numero = aleatorio.nextInt(41)+10;
		reducir = numero - (int)(numero*0.15);
		System.out.println("El numero es " + numero);
		System.out.println("El numero disminuido un 15% es " + reducir);
	}
}