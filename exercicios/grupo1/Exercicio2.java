package exercicios.grupo1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // System.out.println("Seu nome é " + nome + " e Sua idade é: " + idade);
        System.out.printf("Seu nome é %s e Sua idade é: %d", nome, idade);
        scanner.close();
    }
}
