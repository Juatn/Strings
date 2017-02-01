package Ejercicio9;

import java.util.Scanner;

public class VecesPalabra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String frase = "";
		String palabra = "";

		System.out.println("Introduce una frase");
		frase = sc.nextLine();
		System.out.println("Introduce una palabra");
		palabra = sc.nextLine();
		System.out.println(VecesPalabra(palabra, frase));

	}

	public static int VecesPalabra(String palabra, String cadena) {

		int pos = 0;
		int contador = 0;
		pos = cadena.indexOf(palabra); 
		while (pos != -1) { 
			contador++; 
			pos = cadena.indexOf(palabra, pos + 1);
	}
		return contador;

}
}
