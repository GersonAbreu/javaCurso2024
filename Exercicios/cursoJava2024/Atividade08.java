package cursoJava2024;

import java.util.Scanner;
import java.util.Arrays;

public class Atividade08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[5]; // Cria um vetor para armazenar 5 números

		// Solicita 5 números ao usuário
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			numeros[i] = scanner.nextInt();
		}

		// Ordena o vetor em ordem crescente
		Arrays.sort(numeros);

		// Exibe os números em ordem crescente
		System.out.println("Números em ordem crescente:");
		for (int numero : numeros) {
			System.out.println(numero);
		}

		// Fecha o scanner
		scanner.close();
	}
}
