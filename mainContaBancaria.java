package ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class mainContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seja bem vindo ao WJ Bank");
        System.out.println("Digite o nome do titular: ");
        String nome = sc.nextLine();

        ContaBancaria contaBancaria = new ContaBancaria(nome);

        contaBancaria.Menu();

        System.out.println("Volte sempre :)");
        sc.close();
    }
}