package ar.unju.edu.fi.main;

import java.util.Scanner;

import ar.unju.edu.fi.model.Alumno;
import ar.unju.edu.fi.model.Materia;
import ar.unju.edu.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno alumno = new Alumno();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el legajo:");
		Integer legajo = scanner.nextInt();
		System.out.println("Ingrese el apellido:");
		String apellido = scanner.next();
		System.out.println("Ingrese el nombre:");
		String nombre = scanner.next();
		
		alumno.setLegajo(legajo);
		alumno.setNombre(nombre);
		alumno.setApellido(apellido);
		
		
		System.out.println(alumno.toString());
		
		int numMaterias = 1;
		
		while (numMaterias<=2) {
			
			System.out.println("Ingrese el codigo de la materia: ");
			String codigoMateria = scanner.next();
			System.out.println("Ingrese el nombre de la materia: ");
			String nombreMateria = scanner.next();
			
			Materia materia = new Materia(codigoMateria,nombreMateria);
			
			
			System.out.println("Ingrese el codigo del registro de nota: ");
			String codigoNota = scanner.next();
			System.out.println("Ingrese la nota final: ");
			Float nota = scanner.nextFloat();
			
			RegistroNota registroNota = RegistroNota (codigoNota, alumno, materia, nota);
			System.out.println(registroNota.toString());
			numMaterias++;
		}
		
		
				

	}

	private static RegistroNota RegistroNota(String codigoNota, Alumno alumno, Materia materia, Float nota) {
		// TODO Auto-generated method stub
		return null;
	}

}
