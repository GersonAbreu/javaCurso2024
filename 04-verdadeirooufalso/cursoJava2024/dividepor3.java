package cursoJava2024;


import java.util.Scanner;

public class dividepor3 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verifica se o número é divisível por 3 e por 5
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("O número é divisível por 3 e 5.");
        } else {
            System.out.println("O número não é divisível por 3 e 5.");
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
