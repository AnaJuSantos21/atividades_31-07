package curso31_07;

import java.util.Scanner;

public class ativ5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double v1=0, v2=0, v3=0;
		try {
		
		System.out.println("Informe o valor 1: ");
		v1 = ler.nextDouble();
		System.out.println("Informe o valor 2: ");
		v2 = ler.nextDouble();
		System.out.println("Informe o valor 3: ");
		v3 = ler.nextDouble();
		
		if (v1 == v2 && v1 == v3)
			System.out.println("Todos iguais!!!");
		else if (v1 > v2 && v1 > v3)
		    System.out.println("O primeiro valor é maior!" + v1);
		else if (v2 > v3)
			System.out.println("O segundo valor é maior!" + v2);
		else
			System.out.println("O terceiro valor é maior!");
		ler.close();
		
		}
		catch (Exception Erro) {
			System.out.println("Erro, tente novamente!");
		}
		
	}
}

