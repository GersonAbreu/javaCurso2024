package cursoJava2024;

import java.util.Scanner;

public class ConversorSemIF {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			//solicita ao usuario que insira um número:
			System.out.println("Por favor insira um nunero: ");
			String entrada = sc.next();
			
			//Tenta converter a entrada para inteiro:
			int numero = Integer.parseInt(entrada);
			
			//exibe o numero se a conversão for bem sucedida:
			System.out.println("Você inseriu o número: "+numero);
			
		}catch(NumberFormatException e) {
			//captura o erro se a conexão falhar (exemplo: o usuario inseriu texto em vez de numero)
			System.out.println("Erro Entrada invalida, por favor, insira um número válido!");
		}finally {
			//sempre executa essa parte, independente de erro:
			System.out.println("Fim do programa!");
		}
		sc.close();
	}

}
