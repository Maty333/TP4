package ejerciciosTP4;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
Scanner datos = new Scanner (System.in);{
			
			System.out.println("ingrese su nombre: ");
			String nombre = datos.next();
			System.out.println("ingrese su edad: ");
			int edad = datos.nextInt();
			
			if(edad >=18) {
				
				System.out.println("Su nombre es  " + nombre + " y es mayor de edad con: " + edad + " años " );
				
			}else {
				System.out.println("Su nombre es  " + nombre + " y es menor de edad con: " + edad + " años " );
			}
			
		}

	}

}
