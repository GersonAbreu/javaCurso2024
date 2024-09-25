package cursoJava2024;


import java.util.Scanner;

public class atividadewhile01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0; // Variável para armazenar a soma dos números positivos
        int numero;

        System.out.println("Digite números inteiros para somar!");
        System.out.println("------------------------------------");
        System.out.println("Para encerrar digite um numero negativo: Ex -1 ");

        // Loop para continuar lendo números até que um número negativo seja inserido
        while (true) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero < 0) {
                break; 
            } else {
                soma += numero; 
            }
        }

        System.out.println("---------------------------------------");
        System.out.println("A soma dos números positivos digitados, é: " + soma);
        scanner.close(); // Fecha o scanner
    }
}
