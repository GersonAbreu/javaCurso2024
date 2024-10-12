package cursoJava2024;

import java.util.Scanner;

public class Exemplotry {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		try {
			i = 1/0;//não dividiras por zero, nunca, é proibido
			System.out.println("A divisão deu certo o resultado é: "+i);
			System.out.println(i);
		}catch(Exception e) {
			System.out.println("Deu Erro...");
			System.out.println(e);
			
		}

	}

}