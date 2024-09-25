package cursoJava2024;



import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int numero;

        // Solicita ao usuário que insira números até que um número negativo seja inserido
        System.out.println("Digite números inteiros para somar. Digite um número negativo para encerrar.");

        while (true) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            // Verifica se o número é negativo para encerrar o loop
            if (numero < 0) {
                break;
            }

            // Adiciona o número à soma
            soma += numero;
        }

        // Exibe o resultado
        System.out.println("A soma dos números inseridos é: " + soma);

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
