/**
 * Verificar Idade para Votar: 
 *  Crie um algoritmo que receba a idade de uma pessoa e informe se ela já
    pode votar (idade igual ou superior a 16 anos).
    @author Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade para saber se ela pode votar ou não: ");
        int idade = scanner.nextInt();
        // boolean podeVotar = (idade >= 16);
        // String fraseIdadeVotacao = "Sua idade" + (podeVotar ? "" : " não") + " permite votar";

        String fraseIdadeVotacao = "Sua idade";
        if (idade < 16) {
            fraseIdadeVotacao += " não";
        }
        fraseIdadeVotacao += " permite votar";

        System.out.println(fraseIdadeVotacao);

        // if (idade >= 16) {
        //     System.out.println("Sua idade permite votar");
        // }
        // else {
        //     System.out.println("Sua idade não permite votar");
        // }

        scanner.close();
    }
}
