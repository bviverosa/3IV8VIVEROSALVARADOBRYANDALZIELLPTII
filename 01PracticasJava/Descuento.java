/*Name:DescuentoporEdad
Description: Descuento dependiendo de la Edad del Cliente
Author:Viveros Alvarado Bryan Dalziel
*/
import java.util.Scanner;
class Descuento {
        public static void main(String[] args) {
      double Descuento;
      double Edad;
      double precio;
          double precio1;
          double precio2=0;
          double respuesta;
          Scanner scanner;
          scanner = new Scanner(System.in);
          //proceso
        do {do{System.out.println("Calcular Descuento dependiendo de la edad del cliente");
      System.out.println("Hecho por Bryan Dalziel Viveros Alvarado");
      System.out.println("Ingresa el precio"); 
          precio = scanner.nextInt();
             precio1 = precio;
          System.out.println("Ingresa la Edad"); 
          Edad =scanner.nextInt();
		if (precio<=0){ 
			System.out.println("No es posible hacer el proceso");}
			else{
		if (Edad <=0){
			System.out.println("No es posible hacer el proceso");}
			else {
             if(Edad <= 21){ 
               System.out.println("¿Sus padres son socios de la empresa? SI(1),NO(2)");
                 respuesta = scanner.nextInt();
               if(respuesta == 1){
                   precio2 = ((precio)-(precio1*.45));
             }
             else{
               precio2 = ((precio)-(precio1*.25));
               
               }
       }
	       else{
		       if(Edad >65){
			       precio2= ((precio)-(precio1*.40));
		       
		       }
		       else precio2=precio;
             }
             System.out.println("El precio es");
	     System.out.println(precio2);}}}
	     while(precio<0);
     }while (Edad<0);
     
            
               	
          
           
		
		
		
		
        }
		}