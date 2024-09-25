package cursoJava2024;

import java.util.Scanner;

public class AtividadesFisicas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// new esta instanciando a classe, usando a classe

		// Exibe o menu de opções
		System.out.println("Escolha uma Atividade Física: ");
		System.out.println("1. Corrida");
		System.out.println("2. Caminhada");
		System.out.println("3. Ciclismo");

		// recebe a escolha do usuário
		int opcao = scanner.nextInt();
		int calorias = 0;
		String atividade = "";

		// Estrutura switch para selecionar atividade e calcular as calorias:
		switch (opcao) {
		case 1:
			atividade = "Corrida";
			calorias = 300;
			break;
		case 2:
			atividade = "Caminhada";
			calorias = 150;
			break;
		case 3:
			atividade = "Ciclismo";
			calorias = 250;
			break;
			
			default:
			System.out.println("Escolha uma atividade entre 1 e 3!");
			System.exit(0);					
		}
		//exibe o resultado da escolha
		System.out.println("Você escolheu a atividade: "+atividade);
		System.out.println("Calorias queimadas em 30 min: "+calorias+" kcal");
		
		//fecha o scanner
		scanner.close();
	}

}
