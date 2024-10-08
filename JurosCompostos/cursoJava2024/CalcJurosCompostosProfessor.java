package cursoJava2024;

import java.util.Scanner;

public class CalcJurosCompostosProfessor {
	public static void main(String[] args) {
		// Instanciando o Scanner para usá-lo:
		Scanner sc = new Scanner(System.in);

		// Pegar dados dos usuarios
		// Capturando o Capital:
		System.out.println("Digite o Capital: ");
		double capital = sc.nextDouble();
		// Capturando a taxa de juros:
		System.out.println("Digite a taxa de juros anual: ");
		double taxa = sc.nextDouble();
		// Pegar o tempo da aplicação:
		System.out.println("Digite o tempo: ");
		int tempo = sc.nextInt();

		// Cálculo dos juros compostos(anual):
		double montante = capital * Math.pow(1 + (taxa / 100), tempo);
		double juros = montante - capital;
		
		//Resultados:
		System.out.println("O Valor do Juros Compostos pe: " + juros);
		System.out.println("O Valor Total (principal + juros) é: " + montante);
		
		sc.close();
	}

}