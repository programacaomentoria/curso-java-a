/**
 * Imprima os números de 10 a 1 em ordem decrescente. 
Atenção, utilize um loop FOR.
@author: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo3;

public class Exercicio8 {
    public static void main(String[] args) {
        int quantidadeItens = 10;
        for (int contador = quantidadeItens; contador >= 1; contador--) {
            System.out.printf("%d ", contador);
        }
    }
}
