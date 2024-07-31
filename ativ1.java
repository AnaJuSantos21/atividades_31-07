package curso31_07;

import java.util.ArrayList;
import java.util.Scanner;

public class ativ1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int inteiro, soma=0;
		int i=1;
		
		ArrayList<Integer> inteiros = new ArrayList<>();
		
	    while(i <=5) {
		System.out.println("Insira um número inteiro: ");
		inteiro = ler.nextInt();	
		inteiros.add(inteiro);
		
		soma = soma+inteiro;
		i++;

	}
	    System.out.println("A soma dos números é: " + soma);
	    
}
      }

	
