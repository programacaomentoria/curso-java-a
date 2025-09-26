/**
 * Pergunte um número. Diga se este numero é par ou ímpar, escrevendo na tela.
 * @creator: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero e descubra se é par ou ímpar: ");
        int numero = scanner.nextInt();
        // int restoDaDivisaoInteira = numero % 2;

        boolean isPar = numero % 2 == 0;
        // boolean isPar = restoDaDivisaoInteira == 0;

        if (isPar == true) {
            System.out.printf("O número %d é par", numero);
        }
        else {
            System.out.printf("O número %d é ímpar", numero);
        }

        //ou
        System.out.println("\nO numero " + numero + " é: " + ((isPar == true) ? "par" : "ímpar"));
        scanner.close();
    }
}
