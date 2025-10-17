/**
 * Pergunte três números.
   Diga qual é o maior entre eles.
   Atenção, utilize a estrutura IF.
   @author Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 3 números para descobrir qual o maior entre eles ");
        System.out.println("Numero 1: ");
        int numero1 = scanner.nextInt();

        System.out.println("Numero 2: ");
        int numero2 = scanner.nextInt();

        System.out.println("Numero 3: ");
        int numero3 = scanner.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3) {
          System.out.println("Numero 1 é o maior número ou igual ao número 2 ou igual ao número 3");
        }
        else if (numero2 >= numero1 && numero2 >= numero3) {
          System.out.println("Numero 2 é o maior número ou igual ao número 1 ou igual ao número 3");
        }
        else {
          System.out.println("Numero 3 é o maior ou igual ao número 1 ou igual ao número 2");
        }



        scanner.close();
    }
}
