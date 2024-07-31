package curso31_07;

import java.util.ArrayList;

public class ativ3_excecao {

	public static void main(String[] args) {
		ArrayList<String> nome = new ArrayList<>();

		try {
			nome.add("Alice");
			nome.add("Bob");
			nome.add("Charlie");

			System.out.println("nome: " + nome.get(2));
		}
		catch(Exception erro) {
			System.out.println("Informe um valor correto ou ");
			System.out.println("Indique o indice corretamente");


		}

	}
}
