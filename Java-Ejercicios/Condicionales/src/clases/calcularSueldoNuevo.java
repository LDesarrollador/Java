package clases;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class calcularSueldoNuevo {
	public static void main(String[] args)throws IOException {
	//declaracion de variables
		double sueldo;
		double sueldoFinal;
		String area;
		
		DecimalFormat df = new DecimalFormat("#.00");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Indique sueldo actual: ");
		sueldo=scan.nextDouble();
		scan.nextLine();
		System.out.println("Indique su Area: ");
		area=scan.nextLine();
		
		if(sueldo <= 100  && area.equals("produccion")) {
			sueldoFinal= sueldo*1.35;
			System.out.println("Tienes un aumento del 35% en tu sueldo");
			System.out.println("Tu sueldo final es: " + df.format(sueldoFinal));
			
		} else {
			sueldoFinal = sueldo*1.25;
			System.out.println("Tienes un aumento del 25% en tu sueldo");
			System.out.println("Tu sueldo final es: " + df.format(sueldoFinal));
		}
		
	 
		
	}

}
