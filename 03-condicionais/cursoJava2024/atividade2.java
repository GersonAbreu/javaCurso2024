package cursoJava2024;

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a idade do usuário
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        
        // Determina a categoria para o switch
        int categoria = (idade < 16) ? 1 :
                        (idade >= 16 && idade < 18) ? 2 :
                        (idade > 65) ? 3 : 4;

        // Variável auxiliar para categorizar a idade
        /*int categoria;
        if (idade < 16) {
            categoria = 1; // Menor de 16
        } else if (idade >= 16 && idade < 18) {
            categoria = 2; // Entre 16 e 18
        } else if (idade > 65) {
            categoria = 3; // Maior que 65
        } else {
            categoria = 4; // Entre 18 e 65
        }*/

        // Avalia a categoria usando switch
        switch (categoria) {
            case 1:
                System.out.println("Proibido Votar");
                break;
            case 2:
            case 3:
                System.out.println("Pode votar e o Voto é facultativo.");
                break;
            case 4:
                System.out.println("Pode Votar e o Voto é obrigatório.");
                break;
            default:
                System.out.println("Entrada inválida.");
                break;
        }

        scanner.close();
    }
}
