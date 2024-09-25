package cursoJava2024;
import java.util.Scanner;
public class DiaDaSemana {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// new esta instanciando a classe, usando a classe
		// Exibe o menu de opções
		System.out.println("Escolha um dia da semana: ");
		System.out.println("1. Segunda-Feira");
		System.out.println("2. Terça-Feira");
		System.out.println("3. Quarta-Feira");
		// recebe a escolha do usuário
		int opcao = scanner.nextInt();
		// Estrutura switch para selecionar atividade e calcular as calorias:
		switch (opcao) {
		case 1:
			System.out.println("Você Esolheu Segunda-Feira!");
			break;
		case 2:
			System.out.println("Você Esolheu Terça-Feira!");
			break;
		case 3:
			System.out.println("Você Esolheu Quarta-Feira!");
			break;
		default:
			System.out.println("Escolha um dia entre 1 e 3!");
			System.exit(0);
		}
		// fecha o scanner
		scanner.close();
	}
}


