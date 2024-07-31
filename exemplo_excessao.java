package curso31_07;

import java.util.Scanner;

public class exemplo_excessao {

	public static void main(String[] args) {
		int a,b,c;
		Scanner leia = new Scanner(System.in);
		a = 10;
		System.out.println("Digite um número: ");
		b = leia.nextInt();
		try {
			c = a/ b;
			System.out.println("Valor de c: " + c);
		}
		catch (ArithmeticException erro) { //pode ser tbm (RuntimeException erro) ou (Exception erro)
			System.out.println("Não existe divisão por zero");
		}

	}

}
