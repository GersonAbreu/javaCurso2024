package cursoJava2024;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		// Cria um objeto Scanner para capturar a entrada do usuário
		Scanner scanner = new Scanner(System.in);

		// Solicita que o usuário digite um número inteiro
		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();

		// Inicializa a variável que armazenará a soma dos dígitos
		int soma = 0;

		// Calcula a soma dos dígitos do número
		while (numero != 0) {
			// Obtém o último dígito do número
			int digito = numero % 10;
			// Adiciona o dígito à soma
			soma += digito;
			// Remove o último dígito do número
			numero /= 10;
		}

		// Exibe o resultado
		System.out.println("A soma dos dígitos é: " + soma);

		// Fecha o scanner
		scanner.close();
	}
}