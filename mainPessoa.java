package Pessoa;

import java.util.Scanner;

public class mainPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa: ");
        String nome = sc.nextLine();
        System.out.println("Digite a idade da pessoa: ");
        int idade = sc.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        System.out.println(pessoa.toString());

    }
}
