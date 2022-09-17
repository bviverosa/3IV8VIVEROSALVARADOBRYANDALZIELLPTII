/*Name:Contar Numeros positivos y Negativos de unaSerie
Description: Descuento dependiendo de la Edad del Cliente
Author:Viveros Alvarado Bryan Dalziel
*/
import java.util.Scanner;
class FCKYR{
	public static void main(String[] args){
		
		double F;
		double K=0;
		double C=0;
		double R=0;
		double menu =0;
		Scanner scanner;
		scanner=  new Scanner(System.in);
		
		//process
		System.out.println("Convertidor de grados Farenheit a Celsius, Kelvine y Rankine");
      System.out.println("Hecho por Bryan Dalziel Viveros Alvarado");
      System.out.println("Ingresa el valor de los grados farenheit");
		 F= scanner.nextInt();
		System.out.println("¿A que los quiere convertir, Celcius(1), Kelvine(2) o Rankine(3)?");
		menu = scanner.nextInt();
		if(menu == 1) {
			C= ((F-32)*5/9);
		System.out.println("Son"+ C + " grados celsius" );}
		else{if(menu == 2) {
		       K= ((F+495-67)*5/9);
			System.out.println("Son"+ K +" grados Kelvin");}
			else{ if (menu == 3 ){
		      R= (F+459.67);
				  System.out.println("Son" + R + " grados Rankine");}
				else{ 
					System.out.println("No elegiste una opcion");}}}
             
		
		}
		
	}





