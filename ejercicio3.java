package ejerciciosTP4;

import java.util.*;

public class ejercicio3 {
	Scanner info  = new Scanner(System.in);
	
	public void comprasuper() {
			
	double totalsindesc;
	double totalcondesc;
		
	System.out.println("Ingrese el nombre del producto:  ");
	String nombreProducto = info.next();
	
	System.out.println("Ingrese el precio del producto:  ");
	double precio = info.nextDouble();
	
	System.out.println("Ingrese la cantidad a llevar del producto  ");
	int cantidad = info.nextInt();
	
	 totalsindesc = precio*cantidad;
	 
	 System.out.println(" El producto que lleva es: " + nombreProducto + " por una cantidad de " + cantidad + " unidades" + " y sale $" + precio + " la unidad");
	 System.out.println(" El total gastado es de  $" + totalsindesc);
	// System.out.println(" ******************************************");
	 
	 if (totalsindesc > 1000) {
		  
		 System.out.println(" ¡Felicidades compra con descuento!");
		 System.out.println(" El descuento total sera de $" + (totalsindesc*20)/100 );
		 totalcondesc = totalsindesc - (totalsindesc*20)/100 ;
		 
		 System.out.println(" El nuevo monto Total a pagar sera de  $" + totalcondesc);
		 System.out.println(" ***********************************************");
		 
		 
	 }else {
		 System.out.println(" Esta compra no tiene descuento lo sentimos");
		 System.out.println(" ************************************************");
	 }		
	}
	
	  public void seccion ( ) {  
		  String cliente;
		  System.out.println("Ingreso el nombre del cliente");
		  cliente = info.next(); 
		  
		  System.out.println("Primer seccion con descuento superando los $1000 en la compra: verduras ");  
		  System.out.println("Presione 'v'  para continuar en la seccion verduras"); 
		  System.out.println("Presione cualquier letra y enter para continuar a otra seccion"); 
		  String opcion ;	  
		  opcion = info.next();
	  
	  
	  if (opcion.equals("v")) {
		  comprasuper();
	  };
	  System.out.println("Segunda seccion con descuento superando los $1000 en la compra: gaseosas ");
	  System.out.println("Presione 'g'  para continuar en la seccion gaseosas"); 
	  System.out.println("Presione cualquier letra y enter para continuar a otra seccion"); 
	  opcion = info.next();
	  
	  if (opcion.equals("g")) {
		  comprasuper();
	  	  }
	  
	  System.out.println("Tercera seccion con descuento superando los $1000 en la compra: frutas ");
	  System.out.println("Presione 'f'  para continuar en la seccion frutas"); 
	  System.out.println("Presione cualquier letra y enter para continuar a otra seccion"); 
	  opcion = info.next();
	  
	  if (opcion.equals("f")) {
		  comprasuper();
	  	  }else {
	  		System.out.println("No hay mas secciones con descuento ");
	  		System.out.println("Puede seguir comprando productos sin descuento");
	  	  }
	  
	  	}
	

	public static void main(String[] args) {
		
		 ejercicio3 algo = new ejercicio3() ;
		 algo.seccion();
		 

		

	}

}
