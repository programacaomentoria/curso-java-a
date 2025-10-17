/**
 * Preço Total da Compra: Solicite ao usuário os preços de vários produtos. O programa deve parar de pedir preços quando 
 * o usuário digitar 0. Ao final, mostre o valor total da compra.
 * @author: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo3_1;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorTotalDaCompra = 0;
        double valorDoProduto = 0;
        do {
            System.out.println("Qual o valor do produto: ");
            valorDoProduto = scanner.nextDouble();
            valorTotalDaCompra += valorDoProduto;
        }
         while (valorDoProduto != 0);
        
        //exibir o valor total da compra
        System.out.println("O valor total da compra é: " + valorTotalDaCompra);
        scanner.close();
    }
}
