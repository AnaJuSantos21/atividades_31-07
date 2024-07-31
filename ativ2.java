package curso31_07;

import java.util.ArrayList;
import java.util.Scanner;

public class ativ2 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		System.out.println("#####################");
		System.out.println("Digite o valor 0 para sair");
		System.out.println("#####################");
		
		int i=1, n=0, par=0;
		while(i!= 0) { 
			System.out.println("Informe um número inteiro: ");
			i=ler.nextInt();
			numeros.add(i);
		}
		
		for (int numero : numeros) {
			if (numero %2 == 0) {
				System.out.println(numero); 
				
			}
			
			
		}
		
		}

	

	}


