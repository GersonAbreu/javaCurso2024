package cursoJava2024;
import java.util.Scanner;

public class ProdutoInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar nome do produto
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        // Solicitar quantidade do produto
        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        // Solicitar preço unitário do produto
        System.out.print("Digite o preço unitário: ");
        double precoUnitario = scanner.nextDouble();

        // Solicitar código de identificação do produto
        System.out.print("Digite o código de identificação: ");
        int codigoIdentificacao = scanner.nextInt();

        // Solicitar peso do produto
        System.out.print("Digite o peso do produto (em kg): ");
        double peso = scanner.nextDouble();

        // Exibir as informações formatadas
        System.out.println("\n--- Informações do Produto ---");
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço Unitário: R$ " + precoUnitario);
        System.out.println("Código de Identificação: " + codigoIdentificacao);
        System.out.println("Peso: " + peso + " kg");

        scanner.close();
    }
}
