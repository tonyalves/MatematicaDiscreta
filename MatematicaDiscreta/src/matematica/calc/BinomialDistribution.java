package matematica.calc;

import java.util.Scanner;

import matematica.model.Calculatable;

public class BinomialDistribution implements Calculatable{
	Scanner sc = new Scanner(System.in);
	@Override
	public Double calculate() {
		int n = 0;
		int x = 0;
		double p = 0;
		
		System.out.println("Entre com o número de iterações (x) : ");
		x = sc.nextInt();
		System.out.println("Entre com o valor de amostra (n): ");
		n = sc.nextInt();
		System.out.println("Entre com a probabilidade do evento (p): ");
		p = sc.nextDouble();
		double results[] = new double[x + 1];
		int idx = 0;
		while(idx < results.length){
			double b = calculateBinomio(n, idx);
			double px = Math.pow(p, idx);
			double py = Math.pow((1 - p), n - idx);
			results[idx] =  b * px * py;
			idx++;
		}
		
		double result = 0;
		for (int i = 0; i < results.length; i++) {
			result += results[i];
		}
		return result;
	}

	public long calculateBinomio(long n, long x){
		long result = 0;
		result = fatorial(n);
		result /= (fatorial(x) * fatorial(n - x));
		return result;
	}
	
	public long fatorial(long n){
		if(n == 1 || n == 0)
			return 1;
		return n * fatorial(n-1);
	}
}
