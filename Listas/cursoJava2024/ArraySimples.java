package cursoJava2024;

public class ArraySimples {

	public static void main(String[] args) {

		// Criando um array (lista) de frutas:
		String[] frutas = { "Banana", "Maçã", "Pera", "Tomate", "Melância","Melão" };
		
		//exibindo apenas um item do array:
		//array inicia em zero (o), a primeira posição da lista é zero
		//System.out.println("Minha fruta é: "+frutas[1]);
		
		//Exibir todos os itens do array com for:
		//"item <frutas.length":deve ser lido como: enquanto o valor da variavel item for menor que o comprimento do array frutas, incrementar a variavel item usando item++
		for ( int item = 0; item < frutas.length; item++ ) {
			System.out.print(frutas[item]+" ");
			//outra forma
		//for( String fruta : frutas) {
			//System.out.println(fruta);
			
			
		}
		
		
	}

}
