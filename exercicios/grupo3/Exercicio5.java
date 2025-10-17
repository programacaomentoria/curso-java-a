/**
 * Faça um programa que mostra os números de 0 a 100.
 * @author: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo3;

public class Exercicio5 {
    public static void main(String[] args) {
        int quantidadeItens = 100;
        for (int contador = 0; contador <= quantidadeItens; contador++) {
            System.out.printf("%d ", contador);
        }

        //ESCREVER O MESMO COM WHILE
        // int contador = 0;
        // while (contador < quantidadeItens + 1) {
        //     System.out.println(contador);
        //     contador = contador + 1;
        // }

    }
}
