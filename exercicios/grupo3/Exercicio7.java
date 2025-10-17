/**
 * Faça um programa que imprima os números pares 
 * de 2 a 20 inclusive, ou seja, incluindo o 2 e o 20.
 * @author: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo3;

public class Exercicio7 {
    public static void main(String[] args) {
        int quantidadeItens = 20;
        //SOMENTE PAR
        for (int contador = 2; contador <= quantidadeItens; contador++) {
            if (contador % 2 == 0)
                System.out.printf("%d ", contador);
        }
        
        for (int contador = 2; contador <= quantidadeItens; contador += 2) {
            System.out.printf("%d ", contador);
        }

        //SOMENTE IMPAR
        for (int contador = 1; contador <= quantidadeItens; contador++) {
            if (contador % 2 == 1)
                System.out.printf("%d ", contador);
        }

        for (int contador = 1; contador <= quantidadeItens; contador += 2) {
            System.out.printf("%d ", contador);
        }
    }
}
