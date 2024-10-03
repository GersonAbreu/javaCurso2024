package cursoJava2024;

public class OperaConta {

	public static void main(String[] args) {
		// Criando um objeto da classe ContaBancaria com saldo inicial de R$ 1000,00:
		ContaBancaria conta = new ContaBancaria(1000.05);
		
		//operando a conta do cliente:
		//1- Exibindo o saldo atual
		System.out.println("Saldo Inicial: R$ " + conta.getSaldo());

		//2- Realizando um depósito
		conta.depositar(3);
		//Exibindo o saldo após o depósito
		System.out.println("Saldo após depósito: R$ " + conta.getSaldo());

		// 3- Realizando um saque
		conta.sacar(20);

		// Exibindo o saldo após o saque
		System.out.println("Saldo após saque: R$ " + conta.getSaldo());

		// Tentativa de saque com saldo insuficiente
		conta.sacar(2000.0);
		
	}

}
