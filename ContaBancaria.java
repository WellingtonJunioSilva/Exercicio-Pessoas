package ContaBancaria;

public class ContaBancaria {
    private String titularDaConta;
    private double saldo;

    public ContaBancaria(String titularDaConta, double saldo) {
        this.titularDaConta = titularDaConta;
        this.saldo = saldo;
    }

    public String getTitularDaConta() {
        return titularDaConta;
    }

    public void setTitularDaConta(String titularDaConta) {
        this.titularDaConta = titularDaConta;
    }



    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void DepositarValor(double valor) {
        System.out.println("Insira o valor do depósito: ");
        saldo += valor;
        System.out.println("Saldo realizado!");
        return;
    }

    public void SacarValor(double valor) {
        saldo -= valor;
    }
}
