/*
 * Objetivo: Calcule a área de um quadrado. Como calcular: Area = lado \* lado
 * @creator: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculo de área de um quadrado.");
        System.out.print("Digite a medida do lado do quadrado: ");
        int lado = scanner.nextInt();

        double areaQuadrado = Math.pow(lado, 2);
        System.out.printf("A área do quadrado que tem a medida de seu lado = %d é: %.2f", lado, areaQuadrado);
        scanner.close();
    }
}
