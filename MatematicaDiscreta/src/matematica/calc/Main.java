package matematica.calc;

import java.util.Scanner;

import matematica.model.Calculatable;

public class Main {
	public static void main(String args[]) {
		int typeOfCaluculus = 9;
		Calculatable calc = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o tipo de calculo: ");
		System.out.println("1) Teorema de Bayes: ");
		System.out.println("2) Distribuição binomial: ");
		System.out.println("3) Bimômio de Newton: ");
		System.out.println("0) Sair: ");

		
		while(typeOfCaluculus != 0){
			typeOfCaluculus = sc.nextInt();
			switch (typeOfCaluculus) {
			case 1:
				calc = new Bayes();
				break;
			case 2:
				calc = new BinomialDistribution();
				break;
			case 3:
				calc = new NewtonBinomio();
				break;
			case 0:
				System.out.println("Bye!");
				break;
			default:
				System.out.println("Entre com uma opção válida!");
				break;
			}
			
			System.out.println("P ~= "+Math.round(calc.calculate()*100.00) + "%");
		}
		
		
	}
}
