package EsPalindromo;

import java.util.Scanner;

public class Espalindromo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String aux = "";

		System.out.println("Introduce una Palabra : ");
		aux = teclado.nextLine();
		

		if (!Espalindromo(aux)==true){
			System.out.println("Es palindromo");
		}
		if(!Espalindromo(aux)==false){
			System.out.println("No es palindromo");
		}

	}

	public static boolean Espalindromo(String cadena) {
		int inc = 0;
		int des = cadena.length() - 1;
		boolean palin = false;

		while ((inc < des) && (!palin)) {

			if (cadena.charAt(inc) == cadena.charAt(des)) {
				inc++;
				des--;
			} else {
				palin = true;
			}
			
		}
		return palin;

	}

}
