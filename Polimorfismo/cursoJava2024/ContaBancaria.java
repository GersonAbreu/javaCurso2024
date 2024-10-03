package cursoJava2024;

public class ContaBancaria {

    // Atributo privado da classe
    private double saldo;

    // Construtor para iniciar o saldo
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método público para depositar dinheiro na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor; // saldo = saldo + valor
            System.out.println("Depósito de R$ " + valor + " realizado!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    // Método público para sacar dinheiro da conta
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor; // saldo = saldo - valor
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saque invalido: Saldo insuficiente ou valor negativo! Saldo de R$ "+saldo+" .");
        } 
    }

    // Método público para exibir o saldo
    public double getSaldo() {
        return saldo;
    }

}
