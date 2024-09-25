package cursoJava2024;


import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {

  
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita que o usuário digite uma frase
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        
        // Converte a frase para minúsculas para facilitar a contagem de vogais
        frase = frase.toLowerCase();
        
        // Inicializa uma variável para contar as vogais
        int contagemVogais = 0;
        
        // Verifica cada caractere da frase
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contagemVogais++;
            }
        }
        
        // Exibe a contagem de vogais
        System.out.println("A frase contém " + contagemVogais + " vogais.");
        
        // Fecha o scanner
        scanner.close();
    }
}