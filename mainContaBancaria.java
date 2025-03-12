package ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class mainContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double saldo = 0;
        System.out.println("Insira o nome do titular da conta: ");
        String nome = sc.nextLine();
        int opcao;
        ContaBancaria contaBancaria = new ContaBancaria(nome, saldo);

        do {
            System.out.println("1: Saldo");
            System.out.println("2: Deposito");
            System.out.println("3: Saque");
            System.out.println("4: Sair");
            opcao = sc.nextInt();
            double valor = 0;
            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é " + contaBancaria.getSaldo());
                    contaBancaria.setSaldo(saldo);
                    break;

                case 2:
                    
                    break;

                case 3:

                    System.out.println("Insira o valor que deseja sacar: ");

                    break;

                case 4:
                    System.out.println("Obrigado por acessar!");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }while (opcao != 4);
    }
}