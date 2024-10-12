package cursoJava2024;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Atividade2Try {
    public static void main(String[] args) {
        // Especificar o caminho do arquivo
        String caminhoArquivo = "C:\\Users\\Noite\\Desktop\\gerson noturno\\JAVA\\arquivoTeste.txt";
        File arquivo = new File(caminhoArquivo);

        // Verificar se o arquivo existe
        if (!arquivo.exists()) {
            System.out.println("Erro: O arquivo " + caminhoArquivo + " não foi encontrado.");
            return;  // Termina o programa se o arquivo não existir
        }

        // Tentar abrir e ler o arquivo
        try (Scanner scanner = new Scanner(arquivo)) {
            System.out.println("Conteúdo do arquivo " + caminhoArquivo + ":");
            
            // Ler o arquivo linha por linha
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }
            
        } catch (FileNotFoundException e) {
            // Capturar exceção caso o arquivo não possa ser encontrado ou aberto
            System.out.println("Erro: Não foi possível abrir o arquivo " + caminhoArquivo);
            e.printStackTrace();  // Mostra o rastreamento da pilha para depuração
        }
    }
}
