package ContaBancaria;

import java.util.Scanner;

public class ContaBancaria {
    private String titularDaConta;
    private double saldo;

    public ContaBancaria(String titularDaConta) {
        this.titularDaConta = titularDaConta;
        this.saldo = 0;
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
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    public void SacarValor(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente. Saque negado.");
        }
    }

    public void Menu() {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n-------Menu------");
            System.out.println("1.Consultar saldo bancário");
            System.out.println("2.Realizar deposito");
            System.out.println("3.Realizar saque");
            System.out.println("4.Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Saldo: R$" + getSaldo());
                    break;
                case 2:
                    System.out.println("Digite o valor do depósito");
                    double valorDeposito = sc.nextDouble();
                    DepositarValor(valorDeposito);
                    setSaldo(saldo);
                    break;

                case 3:
                    System.out.println("Digite o valor do saque: ");
                    double valorSaque = sc.nextDouble();
                    SacarValor(valorSaque);
                    break;

                case 4:
                    System.out.println("Obrigado por acessar!");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 4);
    }
}

