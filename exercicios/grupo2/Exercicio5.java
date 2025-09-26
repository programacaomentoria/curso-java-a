/**
 * Pergunte um número. Diga se esse número é positivo, negativo ou zero.
 * @creator: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.printf("O número digitado %d é positivo!", numero);
        }
        else if (numero < 0) {
            System.out.printf("O número %d é negativo!", numero);
        }
        else {
            System.out.printf("O número digitado é zero!");
        }
        scanner.close();
    }
}
