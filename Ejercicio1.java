package ejerciciosTP4;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);{
			
			System.out.println("ingrese su nombre: ");
			String nombre = datos.next();
			System.out.println("ingrese su edad: ");
			int edad = datos.nextInt();
			
			System.out.println("Su nombre es  " + nombre + " y su edad es " + edad );
		}
		

	}

}
