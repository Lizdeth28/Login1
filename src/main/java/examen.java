/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriela
 */
package examen;

import java.util.*;


public class examen {
	
	public static void main(String[] args){
		
		String A;
		String B;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese Usuario");
		B = sc.next();
		System.out.println("Ingrese Contraseña");
		A= sc.next();
		
		if("Alumno".equals(B) && "123".equals(A)){
			System.out.println("Usuario Correcto");
			
			System.exit(0);
		}
		else if("Admin".equals(B) && "123".equals(A)){
			System.out.println("Usuario Correcto");
			System.exit(0);
		}
		
		else {
			System.out.println("Usuario Incorrecto");
			
			System.exit(0);
		}
	
		
	}
	

}

