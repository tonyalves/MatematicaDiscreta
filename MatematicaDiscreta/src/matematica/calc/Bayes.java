package matematica.calc;

import java.util.Scanner;

import matematica.model.Calculatable;

public class Bayes implements Calculatable{
	
	private Scanner sc;

	@Override
	public Double calculate() {
		double xA = 0;
		double xB = 0;
		double A = 0;
		double B = 0;
		
		double p;
		sc = new Scanner(System.in); 
		
		System.out.println("Entre com o valor para xA: ");
		xA = sc.nextDouble();
		System.out.println("Entre com o valor para xB: ");
		xB = sc.nextDouble();
		System.out.println("Entre com o valor para A: ");
		A = sc.nextDouble();
		System.out.println("Entre com o valor para B: ");
		B = sc.nextDouble();
		
		p = (xA * A) / ((xA * A) + (xB * B));
		
		return p;
	}
}
