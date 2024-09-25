package cursoJava2024;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class IdadeAtual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a data de nascimento
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o mês de nascimento (1-12): ");
        int mesNascimento = scanner.nextInt();

        System.out.print("Digite o dia de nascimento: ");
        int diaNascimento = scanner.nextInt();

        // Data de nascimento do usuário
        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);

        // Data atual
        LocalDate dataAtual = LocalDate.now();

        // Calcular a idade em anos, meses e dias
        Period periodo = Period.between(dataNascimento, dataAtual);

        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();

        // Calcular o total de dias vividos
        long totalDias = dataNascimento.until(dataAtual).toTotalMonths() * 30 + dias;

        // Exibir a idade atual em anos, meses e dias
        System.out.println("\n--- Idade Atual ---");
        System.out.println("Anos: " + anos);
        System.out.println("Meses: " + meses);
        System.out.println("Dias: " + dias);
        
        // Exibir o total de dias vividos
        System.out.println("Total de dias vividos: " + totalDias);

        scanner.close();
    }
}
