/**
 * Faça um programa que pergunte um número. 
Exiba os números de 0 até o número digitado, 
separados por um espaço, exibindo o resultado.
@author: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo3;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int quantidadeItens = scanner.nextInt();
        for (int contador = 0; contador <= quantidadeItens; contador++) {
            System.out.printf("%d\t", contador);
            if (contador != 0 && contador % 10 == 0)
                System.out.println();
        }
        scanner.close();
    }
}
