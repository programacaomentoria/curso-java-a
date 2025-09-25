/*
 * Objetivo: 
 Calcule a área de um retângulo. Area = comprimento \* altura
 * @creator: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculo de área de um retângulo");
        System.out.print("Digite a altura: ");
        int alturaRetangulo = scanner.nextInt();

        System.out.print("Digite o comprimento: ");
        int comprimentoRetangulo = scanner.nextInt();

        long areaRetangulo = alturaRetangulo * comprimentoRetangulo;
        System.out.printf("A área do retângulo que tem altura %d e comprimento %d é: %d", alturaRetangulo, comprimentoRetangulo, areaRetangulo);
        scanner.close();
    }
}
