package cursoJava2024;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		// Cria um objeto Scanner para capturar a entrada do usuário
		Scanner scanner = new Scanner(System.in);

		// Solicita que o usuário digite uma palavra
		System.out.print("Digite uma palavra: ");
		String palavra = scanner.nextLine();

		// Remove espaços em branco e converte para minúsculas para evitar erros de
		// comparação
		palavra = palavra.replaceAll("\\s+", "").toLowerCase();

		// Verifica se a palavra é um palíndromo
		String palavraInvertida = new StringBuilder(palavra).reverse().toString();

		if (palavra.equals(palavraInvertida)) {
			System.out.println("A palavra \"" + palavra + "\" é um palíndromo.");
		} else {
			System.out.println("A palavra \"" + palavra + "\" não é um palíndromo.");
		}

		// Fecha o scanner
		scanner.close();
	}
}