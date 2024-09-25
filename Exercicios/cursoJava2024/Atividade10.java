package cursoJava2024;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita as notas e pesos
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite o peso da primeira nota: ");
        double peso1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite o peso da segunda nota: ");
        double peso2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite o peso da terceira nota: ");
        double peso3 = scanner.nextDouble();

        // Calcula a média ponderada
        double somaPesos = peso1 + peso2 + peso3;
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / somaPesos;

        // Exibe o resultado
        System.out.printf("A média ponderada é: %.2f%n", mediaPonderada);

        // Fecha o scanner
        scanner.close();
    }
}
