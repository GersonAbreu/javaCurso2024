package cursoJava2024;

import Java.util.Scanner;

public class TabuadaComFor {

	public static void main(String[] args) {

		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.println("Digite um número para Taboada: ");
		int n = scanner.nextInt();

		System.out.println("Tabuada do " + n + ": ");
		for (int i = 1; i <= 10; i++) {
			int resultado = n * i;
			System.out.println(n + "x " + i + "=" + resultado);
		}

	}

}
