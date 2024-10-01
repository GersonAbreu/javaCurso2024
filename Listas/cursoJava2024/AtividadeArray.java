package cursoJava2024;
		
//importando classes prontas do java		
import java.util.ArrayList; // para criar lista de array dinamico
import java.util.Scanner; // para coletar dados do usuario/perguntas

public class AtividadeArray {

    public static void main(String[] args) {
        
        // Criando uma lista dinâmica para armazenar as frutas
        ArrayList<String> frutas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String fruta;  // Variável para armazenar a fruta digitada
        
        // Loop para coletar as frutas do usuário
        while (true) {
            System.out.println("Digite uma fruta ou 'Fim' para encerrar a sua lista: ");
            fruta = scanner.nextLine();  // Lendo a fruta

            // Se o usuário digitar "Fim", o loop é interrompido
            if (fruta.equalsIgnoreCase("Fim")) {
                break;
            }
            frutas.add(fruta); // Adiciona a fruta à lista
        }

        // Exibindo a lista de frutas
        System.out.println("\nLista de Frutas:");
        for (String f : frutas) {
            System.out.println(f); // Imprimindo cada fruta
        }
        
        scanner.close(); // Fechando o Scanner
    }
}
