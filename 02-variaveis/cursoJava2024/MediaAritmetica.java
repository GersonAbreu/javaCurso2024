package cursoJava2024;
public class MediaAritmetica {
    public static void main(String[] args) {
        // Primeira média (8, 9 e 7)
        double media1 = (8 + 9 + 7) / 3.0;

        // Segunda média (4, 5 e 6)
        double media2 = (4 + 5 + 6) / 3.0;

        // Soma das duas médias
        double somaMedias = media1 + media2;

        // Média das médias
        double mediaDasMedias = somaMedias / 2;

        // Exibir resultados
        System.out.println("\n---- Média das Médias----");
        System.out.println("Média dos números 8, 9 e 7: " + media1);
        System.out.println("Média dos números 4, 5 e 6: " + media2);
        System.out.println("Soma das duas médias: " + somaMedias);
        System.out.println("Média das médias: " + mediaDasMedias);
    }
}
