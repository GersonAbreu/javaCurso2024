package cursoJava2024;

public class ManipulandoStrings {

	public static void main(String[] args) {

		// criando strings:
		// String texto = "Bem Vindo ao curso Intermediário de Java.";
		// String texto2 = "Vamos Aprender sobre Strings!";

		// 1.comprimento da string:
		// System.out.println("Comprimento da String: " + texto.length());

		// 2.Concatenar String: (separar)
		// String textoCompleto = texto + "\n" + texto2; // para quebrar o texto coloca
		// String textoCompleto = texto + " " + texto2; // para quebrar o texto coloca
		// \n dentro das aspas
		// System.out.println("Texto Completo: " + textoCompleto);

		// 3.Converter para maiusculas e minusculas:
		// System.out.println("MAIÚSCULAS: "+ texto.toUpperCase());// colocar as letras
		// maiusculas
		// System.out.println("minusculas: " + texto2.toLowerCase());// colocar letras
		// minusculas

		// 4.substituir uma parte da string:
		// String novoTexto = texto.replace("Java", "PHP");
		// System.out.println("Texto após a substituição: " + novoTexto);

		// 5.Buscar por uma substituição:
		// int posicao = texto.indexOf("curso");
		// System.out.println("Posição da paravra curso: " + posicao);

		// 6.verificar se uma string começa ou termina com uma substring:
		// System.out.println("Começa com 'Bem': " + texto.startsWith("Bem"));

		// 7.Dividir uma String:
//		String nomeCompleto = "Gerson Santos Abreu" ;
//		String[] parteDoNomeCompleto = nomeCompleto.split(" ");
//		System.out.println("Palavras no texto completo: " );
//		for ( String parteDoNome : parteDoNomeCompleto ) {
//			System.out.println(parteDoNome);
//			

		// 8.remove espaços:
		String textoComEspacos = "   Texto    com espaços.        ";

		//.trim() remove espaços do inicio e do fim
		//.replaceAll() substitui
		//"\\s+" seleciona todos os espaços após a virgola substitui por um espaço apenas " ".
		System.out.println("Texto sem espaços: '" + textoComEspacos.trim().replaceAll("\\s+", " ") + "'");

		// Remove todos os espaços da string
		String textoSemEspacos = textoComEspacos.replaceAll(" ", "");
		System.out.println("Texto sem NENHUM espaço: " + textoSemEspacos);
		
	}
}
