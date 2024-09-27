package cursoJava2024;

import java.util.Scanner;

public class Criando5ClassesExercicio {
		//1
	public int soma(int a, int b) {
		return a + b;
	}
	//2	
	public int menos(int a, int b) {
		return a - b;
	}
	//3
	public float dividir(float a, float b) {
		return a / b;
	}
		//4
	public int multip(int a, int b) {
		return a * b;
	}
		public static void main(String[] args) {
		
		Criando5ClassesExercicio meu = new Criando5ClassesExercicio();
		Scanner scanner = new Scanner(System.in);
		
				//1
		System.out.println("Digite o primeiro numero: ");
		int num1 = scanner.nextInt();
		System.out.println("Digite o segundo numero: ");
		int num2 = scanner.nextInt();
		System.out.println("A soma de "+ num1 +" e " +num2 + " é: " +meu.soma(num1, num2));
				//2
		System.out.println("A subtração de "+num1+" e "+num2 + " é: " +meu.menos(num1, num2));
				//3
		System.out.println("A divisão de "+num1+" e "+num2 + " é: " +meu.dividir(num1, num2));
				//4
		System.out.println("A multiplicação de "+num1+" e "+num2 + " é: " +meu.multip(num1, num2));
	}

}
