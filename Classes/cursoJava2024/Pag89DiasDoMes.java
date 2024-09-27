package cursoJava2024;
import java.util.Scanner;
public class Pag89DiasDoMes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do mês para saber a quantidade de dias:");
        String mes = scanner.nextLine().trim().toLowerCase(); // padroniza para letras minúsculas
                // Verifica a quantidade de dias no mês informado
        switch (mes) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                System.out.println("O mês escolhido foi "+mes+ " e tem 31 dias.");
                break;
                
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                System.out.println("O mês escolhido foi "+mes+ " e tem 30 dias.");
                break;
                
            case "fevereiro":
                System.out.println("O mês escolhido foi " +mes+ " e tem 28 ou 29 dias (dependendo se é ano bissexto).");
                break;
                
            default:
                System.out.println("Erro: " + mes +" é uma informação inválida. Verifique o nome do mês inserido.");
                break;
        }
           scanner.close();
    }
}
