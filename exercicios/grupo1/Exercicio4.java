/*
 * Objetivo: Calcule o quadrado de um número. Pergunte o número, calcule e exiba no final o resultado.
 * @creator: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para calcular o quadrado deste: ");
        int numero = scanner.nextInt();

        double quadrado = Math.pow(numero, 2);
        System.out.printf("O quadrado do número %d é: %.2f", numero, quadrado);
        scanner.close();
    }
}
