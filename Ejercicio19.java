import java.util.Random;
public class Ejercicio19{
	public static void main(String[] args) {
		int numero;
		int residuo;
		Random aleatorio = new Random();
		numero = aleatorio.nextInt(999)+1;
		residuo = numero%5;
		System.out.println(numero);
		if (residuo == 0) {
			if (numero < 26) {
				System.out.println("Correcto");
			} else {
				System.out.println("Incorrecto");
			}
		} else {
			System.out.println("Incorrecto");
		}
	}
}