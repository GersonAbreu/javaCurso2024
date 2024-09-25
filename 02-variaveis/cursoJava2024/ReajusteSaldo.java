package cursoJava2024;
import java.util.Scanner;

public class ReajusteSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o saldo inicial
        System.out.print("Informe o saldo: ");
        double saldo = scanner.nextDouble();

        // Calcular o reajuste de 1%
        double reajuste = saldo * 0.01;

        // Novo saldo após o reajuste
        double saldoReajustado = saldo + reajuste;

        // Exibir o saldo reajustado
        System.out.println("Saldo com reajuste de 1%: " + saldoReajustado);

        scanner.close();
    }
}
