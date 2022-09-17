/*Name:Numero a Binario
Description: Descuento dependiendo de la Edad del Cliente
Author:Viveros Alvarado Bryan Dalziel
*/
import java.util.Scanner;
class 	Binario{
	public static void main(String[] args){
		String bin= "";
		int num;
	
	Scanner scanner;
		scanner=  new Scanner(System.in);
		//proceso
		System.out.println("Numero Entero a Binario");
		System.out.println("Hecho por Bryan Dalziel Viveros Alvarado");
      System.out.println("Ingresa el numero (solo enteros)");
              num= scanner.nextInt();
		if(num>0){
			while(num>0){
				 if ((num%2) == 0){
				bin="0" + bin;				 
				 }
				 else{
					bin="1" + bin ;
					 }
					 num=(num/2);
				}}
				     else{ System.out.println("No se puede realizar el proceso con negativos");}
				   System.out.print("El numero convertido a binario es" + bin);	}}
					  
