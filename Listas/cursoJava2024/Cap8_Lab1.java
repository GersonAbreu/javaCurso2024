package cursoJava2024;
public class Cap8_Lab1 {

    // A - Criando o método estático maiorNumero que retorna a posição do maior número
    public static int[] maiorNumero(int[] array) {
        int maior = array[0];  // Inicializa o maior com o primeiro valor do array
        int posicao = 0;       // Inicializa a posição como 0 (primeiro índice)

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];  // Atualiza o maior número
                posicao = i;       // Atualiza a posição do maior número
            }
        }

        // Retorna um array com o maior número e sua posição
        return new int[] {maior, posicao};
    }

    public static void main(String[] args) {
        // B - Criando um array de inteiros
        int[] numeros = {10, 50, 30, 70, 40};  // Inicialize o array com alguns números

        // Chamada ao método maiorNumero e armazenando o retorno
        int[] resultado = maiorNumero(numeros);
        int maior = resultado[0];     // O maior número
        int posicao = resultado[1];   // A posição do maior número

        // Imprimindo o maior número e sua posição na tela
        System.out.println("O maior número do array é: " + maior+" na posição ["+posicao+"]");
       
    }
}
