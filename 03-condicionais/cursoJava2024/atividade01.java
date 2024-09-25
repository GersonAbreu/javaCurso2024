package cursoJava2024;

import java.util.Scanner;

public class atividade01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a sua idade: ");
		int idade = scanner.nextInt();

		if (idade < 16) {
			System.out.println("Proibido Votar");
		} else if ((idade >= 16 && idade < 18) || idade > 65) {
			System.out.println("Pode votar e o Voto é facultativo.");
		} else if (idade >= 18 && idade <= 65) {
			System.out.println("Pode Votar e o Voto é obrigatório.");
		} else {
			System.out.println("Entrada inválida.");
		}
		scanner.close();
	}
}