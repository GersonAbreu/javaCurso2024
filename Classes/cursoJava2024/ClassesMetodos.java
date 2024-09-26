package cursoJava2024;

public class ClassesMetodos {

	// Método 1 : calcula a soma de 2 valores:
	public int soma(int a, int b) {
		return a + b;
	}

	// metodo 2: verifica se o numero é par
	public boolean par(int numero) {
		return numero % 2 == 0;
	}

	// metodo 3: inverter string
	public String inverter(String nome) {
		return new StringBuilder(nome).reverse().toString();

	}

	// metodo 4: calcule o fatorial de um numero

	public int fatorial(int numero) {
		if (numero == 0 || numero == 1) {
			return 1;
		}
			return numero * fatorial(numero - 1);
		}
	

	// Este metodo executa outros metodos!
	public static void main(String[] args) {

		// Instanciando a classe que criamos, não precisa instanciar novamente para usar
		// o metodo ou acrescentar classe.:
		ClassesMetodos util = new ClassesMetodos();

		// Chamando o Método soma:
		System.out.println("Soma de 5 e 3: " + util.soma(5, 3));
		// chamando o metodo par, para saber se o metodo soma é par
		System.out.println("O numero da soma acima é: " + util.par(util.soma(5, 3)));

		// chamando metodo para inverter string
		// variavel para ser invertida
		String nome = "Gerson";
		// Chamada do método inverter
		String invertida = util.inverter(nome);

		System.out.println("O nome é: " + nome + " e invertido fica: " + invertida);


		// Exibe o resultado
		System.out.println("O fatorial de 5  é: " + util.fatorial(5));

	}

}
