/*
 * Objetivo: Perguntar o nome de um aluno, pergunte as 4 notas e calcule a média aritmética(média simples), exibindo no final.
 * @creator: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo1;

import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("A media do Aluno: %s, que tem as notas %.2f, %.2f, %.2f e %.2f é: %.2f", nome, nota1, nota2, nota3, nota4, media);

        scanner.close();
    }
}
