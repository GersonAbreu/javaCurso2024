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
	
	//metodo 5: encontra o maior numero em um array:
	public int maiorNumero(int[]numeros) {
		int maior = numeros[0];
		for(int numero :numeros) {
			if (numero > maior ) {
				maior = numero;
			}
		}
			return maior;
	}
	

	// Este metodo executa outros metodos!
	public static void main(String[] args) {

		// Instanciando a classe que criamos, não precisa instanciar novamente para usar
		// o metodo ou acrescentar classe.:
		ClassesMetodos util = new ClassesMetodos();

		//1. Chamando o Método soma :
		System.out.println("Soma de 5 e 3: " + util.soma(5, 3));
		
		//2. chamando o metodo par, para saber se o metodo soma é par 
		System.out.println("O numero da soma acima é: " + util.par(util.soma(5, 3)));

		//3. chamando metodo para inverter string 
		// variavel para ser invertida
		String nome = "Gerson";
		// Chamada do método inverter 
		String invertida = util.inverter(nome);

		System.out.println("O nome é: " + nome + " e invertido fica: " + invertida);


		// 4. Exibe o resultado de fatorial
		System.out.println("O fatorial de 5  é: " + util.fatorial(5));
		
		//5. exibe o numero maior
		int [] numeros = {1,5,6,8,44};
		System.out.println("O maior numero do Array é: "+ util.maiorNumero(numeros));
		
		
		
		
		

	}

}
