/*Name:Contar Numeros positivos y Negativos de una Serie
Description: Descuento dependiendo de la Edad del Cliente
Author:Viveros Alvarado Bryan Dalziel
*/
import java.util.Scanner;
class NYP{
	public static void main(String[] args){
		int Positivo=0;
		int Negativo=0;
		double num;
		char para= 0;
		Scanner scanner;
		
		scanner=  new Scanner(System.in);
		//proceso
		System.out.println("Codigo para saber cuantos numeros positivos y negativos hay en una serie");
		System.out.println("Hecho por Bryan Dalziel Viveros Alvarado");		
		System.out.println("Escribe la serie de numeros y cuando quieras parar escribe S, si no, escribe cualquier caracter");
		do{
			System.out.println("Escribe un numero");
			num= scanner.nextInt();
				if(num == 0){
			Negativo= Negativo+0;
			Positivo=Positivo+0;
					System.out.println("¿Parar?");
			para= scanner.next().charAt(0);}
		
				else {if(num>0){
					Positivo= Positivo + 1;
				}			
				else { 
						Negativo= Negativo + 1;
					
					}
					System.out.println("¿Parar?");
			para= scanner.next().charAt(0);
					
			
		      
		}}while (para != 'S');
		System.out.println("Hay "+ Positivo +"numeros Positivos");
		System.out.println("Hay "+ Negativo +"numeros Negativos");
}
}
		
		