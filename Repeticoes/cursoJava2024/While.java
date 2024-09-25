package cursoJava2024;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//criando variavel começando com zero:
		
		System.out.println("Digite um numero para iniciar o contador: ");
		int contador = scanner.nextInt();
		
		System.out.println("Digite um numero do pulo: ");
		int pulo = scanner.nextInt();
		
		System.out.println("Digite até quanto deseja contar: ");
		int limite = scanner.nextInt();
		
		while ( contador <= limite) { 
			System.out.print(contador+" , ");
			//contador = contador + 1; //forma 1incrementa a variavel, aumenta o valor de 1 em 1
			//contador++; //forma 2 faz a mesma coisa da linha de cima
			contador += pulo ; //forma 3
		
		}
 scanner.close();
	}

}
