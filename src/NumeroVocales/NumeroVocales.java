package NumeroVocales;

import java.util.Scanner;

public class NumeroVocales {

	public static void main(String[] args) {
		
		//VARIABLES;
		
		Scanner teclado = new Scanner(System.in);
		String cadena = "";
		
		
		System.out.println("Introduce una palabra o frase :");
		cadena = teclado.nextLine();
		
		System.out.println("Esta frase contiene " +NumeroVocales(cadena)+" Vocales");

	}

	// FUNCIONES
	public static int NumeroVocales(String frase) {
		
		int contador=0;
		
		for (int i=0;i<frase.length();i++){
		if (frase.charAt(i)=='a' || frase.charAt(i)=='e' || frase.charAt(i)=='i' || 
				frase.charAt(i)=='o' ||frase.charAt(i)=='u'){
			contador++;
		}

		}return contador;
}

}
