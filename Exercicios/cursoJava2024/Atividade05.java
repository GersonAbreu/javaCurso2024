package cursoJava2024;

import java.util.Random;

public class Atividade05 {

	public static void main(String[] args) {
		// Cria um objeto Random para gerar números aleatórios
		Random random = new Random();

		// Gera e exibe 5 números aleatórios entre 1 e 100
		System.out.println("5 números aleatórios entre 1 e 100:");
		for (int i = 0; i < 5; i++) {
			int numeroAleatorio = random.nextInt(100) + 1; // Gera um número entre 1 e 100
			System.out.println(numeroAleatorio);
		}
	}
}