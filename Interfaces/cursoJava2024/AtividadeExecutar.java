package cursoJava2024;

import java.util.Scanner;

public class AtividadeExecutar {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Selecione a forma de pagamento:");
		System.out.println("1 - Cartão de Crédito");
		System.out.println("2 - Boleto");

		int escolha = sc.nextInt();
		AtividadePagamento pagamento;

		// Condição para escolher a forma de pagamento
		if (escolha == 1) {
			pagamento = new AtividadeCartao();
		} else if (escolha == 2) {
			pagamento = new AtividadeBoleto();
		} else {
			System.out.println("Forma de pagamento inválida.");
			sc.close();
			return;
		}
	pagamento.realizarPagamento();
	 sc.close();
	}

}
