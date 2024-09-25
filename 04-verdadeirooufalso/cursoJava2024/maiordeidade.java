package cursoJava2024;


import java.util.Scanner;

public class maiordeidade {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a idade
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        // Verifica se a pessoa é maior de idade
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
