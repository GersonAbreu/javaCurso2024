package cursoJava2024;

import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita uma frase ao usuário
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int contadorLetras = 0;
        int contadorEspacos = 0;

        // Percorre cada caractere da frase
        for (char c : frase.toCharArray()) {
            // Verifica se o caractere é uma letra (a-z ou A-Z)
            if (Character.isLetter(c)) {
                contadorLetras++;
            }
            // Verifica se o caractere é um espaço em branco
            else if (Character.isWhitespace(c)) {
                contadorEspacos++;
            }
        }

        // Exibe os resultados
        System.out.println("Total de letras: " + contadorLetras);
        System.out.println("Total de espaços em branco: " + contadorEspacos);

        // Fecha o scanner
        scanner.close();
    }
}
