/**
 * Preencher e Imprimir Vetor: Crie um vetor de 5 posições. Peça ao usuário para preencher cada posição com um número inteiro e, 
 * em seguida, imprima todos os elementos do vetor.
 * @author: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo4;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanhoDoVetor = 5;
        int[] elementos = new int[tamanhoDoVetor];
        for (int indice = 0; indice < tamanhoDoVetor; indice++) {
            System.out.println("Digite um numero inteiro: ");
            //ler a informacao do teclado, e armazenar no vetor na posicao x
            elementos[indice] = scanner.nextInt();
        }

        for (int indice = 0; indice < tamanhoDoVetor; indice++) {
            //imprimir o conteudo do elemento no indice x
            System.out.println(elementos[indice]);
        }

        scanner.close();
    }
}

