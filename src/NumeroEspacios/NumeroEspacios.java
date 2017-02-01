package NumeroEspacios;

import java.util.Scanner;

public class NumeroEspacios {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena = "";
		

		System.out.println("Introduce una frase: ");
		cadena = teclado.nextLine();

		System.out.println("El numero de espacios es: " + NumeroEspacios(cadena));

	}

	public static int NumeroEspacios(String espacios) {

		int pos = 0;
		int contador = 0;
		pos = espacios.indexOf(" "); // se busca el primer espacio en blanco
		while (pos != -1) { // mientras que se encuentre un espacio en blanco
			contador++; // se suma
			pos = espacios.indexOf(" ", pos + 1);

		}
		return contador;

	}
}
