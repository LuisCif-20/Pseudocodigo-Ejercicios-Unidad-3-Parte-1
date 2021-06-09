import java.util.Scanner;
public class Ejercicio2{
	public static void main(String[] args){
		String pais;
		String capital;
		Scanner datos = new Scanner(System.in);
		System.out.println("Ingresa el país");
		pais = datos.nextLine();
		System.out.println("Ingresa la capital");
		capital = datos.nextLine();
		System.out.println(capital + " es la capital de " + pais);
	}
}