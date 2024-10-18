//package cursoJava2024;
//
//import java.util.Scanner;
//
//public class Login {
//
//	public static void main(String[] args) {
//		// variaveis fixas de nome de usuario e senha:
//		String usuarioCorreto = "admin";
//		String senhaCorreta = "123";
//
////		// numero maximo de tentativas:
////		int tentativasMaximas = 3;
////		int tentativas = 0; // contador de tentativas
//
//		// entradas do usuario:
//		Scanner scanner = new Scanner(System.in);
//
//		// tentativa de login 01:
//		System.out.println("Digite o nome do usuário: ");
//		String usuario = scanner.nextLine();
//
//		System.out.println("Digite a senha: ");
//		String senha = scanner.nextLine();
//
//		if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
//			System.out.println("Login realizado com sucesso! Bem-Vindo!");
//		} else {
//			// tentativas = tentativas + 1;
//			tentativas++; // mesma coisa que a linha de cima
//			System.out.println("Usuário ou senha incorretos, tente novamente!");
//
//			// tentativa de login 01:
//			System.out.println("Digite o nome de usuário: ");
//			usuario = scanner.nextLine();
//
//			System.out.println("Digite a senha: ");
//			senha = scanner.nextLine();
//
//			if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
//				System.out.println("Login realizado com sucesso! Bem-Vindo!");
//			} else {
//				// tentativa de loigin 02:
//				tentativas++;
//				System.out.println("Usuário ou senha incorretos, tente novamente!");
//
//				// tentativa final
//				System.out.println("Tentativa final, seu login será bloqueado!");
//				System.out.println("-------------------------");
//				System.out.println("Digite o nome do usuário: ");
//				usuario = scanner.nextLine();
//				
//				System.out.println("Digite a senha: ");
//				senha = scanner.nextLine();
//				
//				if ( usuario.equals (usuarioCorreto) && senha.equals(senhaCorreta)) {
//					System.out.println("Login bem sucedido! Bem-Vindo!");
//					
//				} else {
//					tentativas++;
//					System.out.println("Acesso Bloqueado após 3 tentativas");
//				} 
//				
//
//			}
//		}
//		//fechar scanner
//		scanner.close();
//	}
//	
//
//}
