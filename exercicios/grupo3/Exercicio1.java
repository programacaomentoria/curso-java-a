/**
 * Calcule o fatorial de um número. 
    Pergunte o número, faça o loop e exiba o resultado no final. Exemplo: Fatorial de 5 => 5 * 4 * 3 * 2 * 1 = 120
    @author: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para calcular o fatorial: ");
        int numeroParaFatorial = scanner.nextInt();
        int numeroFatorial = 1;

        int controle = numeroParaFatorial;
        while(controle > 0){
            numeroFatorial = numeroFatorial * controle; //5, 20, 60, 120, 120
            controle--;
        }

        // for (int count = numeroParaFatorial; count > 0; count--) {
        //     numeroFatorial *= count;
        // }
        
        System.out.printf("O fatorial de %d é %d", numeroParaFatorial, numeroFatorial);
        scanner.close();
    }
}
