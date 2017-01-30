package Ejercicio1;

public class dosnumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int num2=0;
		boolean correcto=true;
		
		if (args.length<2){
			correcto=false;
			System.out.println("No debe haber menos de números");
		}
		else if (args.length>2){
			correcto=false;
			System.out.println("No puede haber más de dos números");
		}
		
		else if(correcto==true){
			num=Integer.parseInt(args[0]);
			num2=Integer.parseInt(args[1]);
			//SUMA
			System.out.println("La suma es "+Suma(num,num2));
			System.out.println("La resta es "+Resta(num,num2));
			System.out.println("La multiplicacion es "+Multiplicacion(num,num2));
			System.out.println("La division es "+Division(num,num2));
			
	
		}
		
		

	}

	public static int Suma(int numero1, int numero2){
	
		int suma=numero1+numero2;
	
	return suma;
	}
	
	public static int Resta(int numero1,int numero2){
		
		int resta;
		resta=numero1-numero2;
	
	return resta;
}
	public static int Multiplicacion(int numero1,int numero2){
		
		int multi;
		multi=numero1*numero2;
	
	return multi;
}
	public static int Division(int numero1,int numero2){
		
		int divi;
		divi=numero1/numero2;
	
	return divi;
}
}
