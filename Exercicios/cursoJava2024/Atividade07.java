package cursoJava2024;
import java.util.Scanner;
public class Atividade07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Solicita três números inteiros
		System.out.print("Digite o primeiro número: ");
		int numero1 = scanner.nextInt();
		System.out.print("Digite o segundo número: ");
		int numero2 = scanner.nextInt();
		System.out.print("Digite o terceiro número: ");
		int numero3 = scanner.nextInt();
		// Inicializa o maior e o menor número
		int maior = numero1;
		int menor = numero1;
		// Verifica o maior número
		if (numero2 > maior) {
			maior = numero2;
		}
		if (numero3 > maior) {
			maior = numero3;
		}
		// Verifica o menor número
		if (numero2 < menor) {
			menor = numero2;
		}
		if (numero3 < menor) {
			menor = numero3;
		}
		// Exibe o resultado
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
		// Fecha o scanner
		scanner.close();
	}
}
