package cursoJava2024;

import java.util.Scanner;

public class CalcJurosSimples {

	public static void main(String[] args) {
		//instanciando a classe scanner para usa-la
		Scanner scanner = new Scanner(System.in);
		
		//entrada de valores
		System.out.println("Capital a investir(R$): ");
		double capital = scanner.nextDouble();
		
		System.out.println("Qual é a taxa de juros(%): ");
		double taxa = scanner.nextDouble();
		
		System.out.println("Tempo em Anos: ");
		int tempo = scanner.nextInt();
		
		
		double juros = (capital * taxa * tempo)/100;
		System.out.println("O valor dos juros é: "+juros);
		System.out.println("O total é: "+(juros + capital));
		
		//resultado final
		double total = capital + juros;
		System.out.println("Capital inicial + juros: "+ total);
		scanner.close();
		
		
	}

}
