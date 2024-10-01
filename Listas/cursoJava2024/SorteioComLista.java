package cursoJava2024;

// Importando classes prontas do Java		
import java.util.ArrayList; // Para criar lista de array dinâmico
import java.util.Random; // Para gerar números aleatórios
import java.util.Scanner; // Para coletar dados do usuário/perguntas

public class SorteioComLista {

    public static void main(String[] args) {
        
        // Criando uma lista dinâmica para armazenar os nomes
        ArrayList<String> nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String nome;  // Variável para armazenar o nome digitado
        
        System.out.println("Digite um Nome para o Sorteio ou 'Fim' para encerrar: ");
        // Loop para coletar os nomes do usuário
        while (true) {
            System.out.print("Nome: ");
            nome = scanner.nextLine();  // Lendo o nome

            // Se o usuário digitar "Fim", o loop é interrompido
            if (nome.equalsIgnoreCase("Fim")) {
                break;
            }
            nomes.add(nome); // Adiciona o nome à lista
        }

        // Exibindo a lista de nomes
        System.out.println("\nLista de Nomes:");
        for (String n : nomes) {
            System.out.println(n); // Imprimindo cada nome
        }
        
        // Verifica se a lista não está vazia
        if (!nomes.isEmpty()) {
            // Gerando um número aleatório para sortear um nome
            Random random = new Random();
            int indiceSorteado = random.nextInt(nomes.size()); // Número aleatório entre 0 e o tamanho da lista
            String nomeSorteado = nomes.get(indiceSorteado); // Obtendo o nome sorteado
            
            // Exibindo o nome sorteado
            System.out.println("\nNome sorteado: " + nomeSorteado);
        } else {
            System.out.println("Nenhum nome foi adicionado para o sorteio.");
        }
        
        scanner.close(); // Fechando o Scanner
    }
}