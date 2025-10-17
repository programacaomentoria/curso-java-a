/**
 *  Pergunte a nota de um aluno (de 0 a 10).
    Diga se o aluno está reprovado (nota < 5), em recuperação (nota entre 5 e 6.9) ou aprovado
    (nota ≥ 7)
 */
package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota do aluno: ");
        float notaAluno = scanner.nextFloat();
        if (notaAluno < 0 || notaAluno > 10)
            System.out.println("Nota é inválida");
        else if(notaAluno < 5)
            System.out.println("Aluno reprovado");
        else if (notaAluno >= 5 && notaAluno < 7)
            System.out.println("Aluno de recuperação");
        else
            System.out.println("Aluno aprovado");
        scanner.close();
    }
}
