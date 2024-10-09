package cursoJava2024;//aqu o nome é o dominio de criação

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
    	ExercicioDeApi  viaCepService = new ExercicioDeApi();
        Scanner scanner = new Scanner(System.in);
        try {
            // Solicitar o CEP do usuário
            System.out.print("Digite o CEP: ");
            String cep = scanner.nextLine().trim(); // Captura o CEP e remove espaços em branco
            // Verifica se o CEP contém exatamente 8 dígitos
            if (cep.length() != 8 || !cep.matches("\\d+")) {
                System.out.println("CEP inválido! O CEP deve conter 8 dígitos numéricos.");
            } else {
                // Chama o serviço para buscar o CEP
                String resultado = viaCepService.buscarCep(cep);
                System.out.println("\nResultado da busca por CEP: " + cep + "\n");
                System.out.println(resultado);
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao buscar o CEP: " + e.getMessage());
        } finally {
            scanner.close(); // Fecha o Scanner
        }
    }
}
