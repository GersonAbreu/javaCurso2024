package cursoJava2024;
import java.util.Scanner;

public class imc {

    public static void main(String[] args) {
        // Criando o Scanner para capturar as entradas do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando o peso do usuário
        System.out.print("Digite o seu peso em kg: ");
        double peso = scanner.nextDouble();
        
        // Solicitando a altura do usuário
        System.out.print("Digite a sua altura em metros (ex: 1,75): ");
        double altura = scanner.nextDouble();
        
        // Calculando o IMC
        double imc = peso / (altura * altura);
        
        // Exibindo o resultado do IMC
        System.out.println("Seu IMC é: " + imc);
        
        // Interpretando o resultado do IMC
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Você está com peso normal.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Você está com sobrepeso.");
        } else {
            System.out.println("Você está com obesidade.");
        }
        
        // Fechando o Scanner
        scanner.close();
    }
}
