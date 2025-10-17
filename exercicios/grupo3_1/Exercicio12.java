/**
 * Média de Notas: Solicite ao usuário a quantidade de notas que ele deseja inserir. 
 * Em seguida, peça cada uma das notas e calcule a média aritmética delas.
 * @author: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo3_1;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas: ");
        int quantidadeDeNotas = 0;

        quantidadeDeNotas = scanner.nextInt();
        double somatoriaDeNotas = 0;
        double media = 0;

        for (int numeroDaPergunta = 1; numeroDaPergunta <= quantidadeDeNotas; numeroDaPergunta++) {
            System.out.println("Digite a nota " + numeroDaPergunta + ": ");
            double notaDigitada = scanner.nextDouble();
            somatoriaDeNotas += notaDigitada;
        }

        media = somatoriaDeNotas / quantidadeDeNotas;
        System.out.println("A media encontrada das notas é: " + media);
        scanner.close();
    }
}
