package cursoJava2024;

import java.util.Scanner;

public class Pag88Primo {

    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
        // Variável que receberá o valor a ser verificado
          
        System.out.println("Escolha um Numero para saber se ele é primo: ");
        int numero = scanner.nextInt();
        
        int divisores = 0;

        // Loop para contar os divisores
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }

        // Verifica se o número é primo
        if (divisores == 2) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
