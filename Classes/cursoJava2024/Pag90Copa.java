package cursoJava2024;
import java.util.Scanner;
public class Pag90Copa {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Quaantas Copas do mundo e em quais anos foram realizadas? ");
    	System.out.println("Digite o ano em que estamos para saber: ");
        int anoAtual = scanner.nextInt();  
               // Inicializa a variável de posição
        int posicao = 1;  // Contador de posição

        System.out.println("Anos de ocorrência da Copa do Mundo de Futebol:");

        // Loop que começa em 1930 e vai até o ano atual, incrementando de 4 em 4
        for (int ano = 1930; ano <= anoAtual; ano += 4) {
            // Pular os anos em que não houve Copa (1942 e 1946)
            if (ano == 1942 || ano == 1946) {
                continue;  // pula a iteração atual e passa para o próximo ciclo
            }
                        // Imprime o ano de ocorrência da Copa
            // Imprime o ano de ocorrência da Copa com sua posição
            System.out.println(posicao + "ª Copa: " + ano);
         // Incrementa a posição
            posicao++;
        }
        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
