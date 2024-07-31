package curso31_07;

import java.util.ArrayList;
import java.util.Scanner;

public class correcao_ativ1 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		System.out.println("#####################");
		System.out.println("Digite o valor 0 para sair");
		System.out.println("#####################");
		
		int i=1, soma=0;
		while(i!= 0) {  //vai repetir enquanto for diferente de 0, !=diferente
			System.out.println("Informe o valor a ser somado: "); //Carregar dados
			i=ler.nextInt();
			numeros.add(i);
		}
		
		for(int n: numeros) {
			soma = soma + n; //ou soma+=n;
			
		}
		System.out.println("Lista é : " + numeros); // Mostra a lista
		System.out.println("Soma é : " + soma); // Resultado da soma
		}

	}


