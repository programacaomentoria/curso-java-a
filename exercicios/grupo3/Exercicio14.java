/**
 Pergunte 5 números e calcule a média. 
Atenção, utilize um loop FOR.
@author: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo3;

import java.util.Scanner;

public class Exercicio14 {
    static void main(String[] args) {
        double somatoria = 0;
        double media = 0;
        int qtdeNumerosParaPerguntar = 5;

        Scanner scanner = new Scanner(System.in);
        for (int perguntaNumero = 1; perguntaNumero <= qtdeNumerosParaPerguntar; perguntaNumero++) {
            System.out.println("Digite um numero: ");
            double numero = scanner.nextDouble();
            somatoria += numero;
        }

        media = somatoria / qtdeNumerosParaPerguntar;
        System.out.printf("A média dos numeros digitados: %.2f", media);
        scanner.close();
    }
}
