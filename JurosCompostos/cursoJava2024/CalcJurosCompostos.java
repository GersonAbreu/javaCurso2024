package cursoJava2024;

import java.util.Scanner;

public class CalcJurosCompostos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Capital inicial a investir (R$): ");
        double capital = scanner.nextDouble();

        System.out.println("Qual é a taxa de juros mensal (%): ");
        double taxa = scanner.nextDouble() / 100; // Converter para decimal

        System.out.println("Tempo em meses: ");
        int tempo = scanner.nextInt();

        // Inicializa o montante total com o capital inicial
        double montante = capital;

        // Loop para os depósitos mensais
        for (int i = 1; i <= tempo; i++) {
            System.out.println("Valor a depositar no mês " + i + ": ");
            double deposito = scanner.nextDouble();

            // Atualiza o montante com o depósito e aplica os juros
            montante += deposito; // Adiciona o depósito mensal
            montante *= (1 + taxa); // Aplica juros sobre o montante atualizado
        }

        // Resultado final
        System.out.println("Em Juros Compostos, o total após " + tempo + " meses é: R$ " + montante);
        
        scanner.close();
    }

}


