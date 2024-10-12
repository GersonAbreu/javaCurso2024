package cursoJava2024;
import java.util.Scanner;
public class AtividadeTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Solicitar ao usuário que insira os dois números inteiros
            System.out.print("Insira o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Insira o segundo número: ");
            int num2 = scanner.nextInt();

            // Verificar se o segundo número é zero antes de realizar a divisão
            if (num2 == 0) {
                throw new ArithmeticException("Erro: Não é possível dividir por zero.");
            }

            // Realizar a divisão
            int resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            // Capturar e tratar a exceção de divisão por zero
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Capturar qualquer outra exceção inesperada
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            System.out.println("Fim da Execução!");
            scanner.close();
        }
    }
}

