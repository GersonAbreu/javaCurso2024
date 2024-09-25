package cursoJava2024;




import java.util.Scanner;

public class comparaNumeros {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira dois números inteiros
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        // Compara os dois números
        if (numero1 > numero2) {
            System.out.println("O primeiro número é maior que o segundo.");
        } else if (numero1 < numero2) {
            System.out.println("O segundo número é maior que o primeiro.");
        } else {
            System.out.println("Os números são iguais.");
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
