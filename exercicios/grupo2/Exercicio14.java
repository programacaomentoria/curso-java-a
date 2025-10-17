/**
 * Média de Aprovação: Um aluno é aprovado se sua média final for igual ou superior a 7. Peça a nota do
aluno e informe se ele foi "Aprovado" ou "Reprovado".
 * @author Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a média final: ");
        float mediaFinal = scanner.nextFloat();
        String fraseAprovacao = "";

        if (mediaFinal < 0 || mediaFinal > 10 ) {
            fraseAprovacao = "Média inválida";
        }
        else {
            fraseAprovacao = "O aluno com a média " + mediaFinal + " foi " + ((mediaFinal >= 7) ? "Aprovado" : "Reprovado");
        }

        System.out.println(fraseAprovacao);
        scanner.close();
    }
}
