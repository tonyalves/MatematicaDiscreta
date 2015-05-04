package matematica.calc;

import java.util.Scanner;

import matematica.model.Calculatable;

public class NewtonBinomio implements Calculatable{
	Scanner sc = new Scanner(System.in);
	@Override
	public Double calculate() {
		long x, y = 0;
		int n = 0;
		System.out.println("Entre com o valor para x: ");
		x = sc.nextLong();
		System.out.println("Entre com o valor para y: ");
		y = sc.nextLong();
		System.out.println("Entre com o valor para n: ");
		n = sc.nextInt();
		long results[] = new long[n];
		BinomialDistribution bd = new BinomialDistribution();
		for (int i = 0; i < n; i++) {
			long bin = bd.calculateBinomio(n, i);
			long x1 = (long) Math.pow(x, n-i);
			long y1 = (long) Math.pow(y, i);
			results[i] = bin * x1 * y1;
		}
		long result = 0;
		for (int i = 0; i < results.length; i++) {
			result += results[i];
		}
		return (double) result;
	}

}
