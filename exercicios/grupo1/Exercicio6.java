/*
 * Objetivo: 
 * Calcule a área de um círculo com base no raio informado. Como calcular: A = PI \* R ao quadrado
 * @creator: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculo de área de um circulo");
        System.out.print("Digite a medida do raio do círculo: ");
        int raio = scanner.nextInt();

        double areaCirculo = Math.PI * Math.pow(raio, 2);
        System.out.printf("A área do círculo que tem a medida de seu raio = %d é: %.2f", raio, areaCirculo);
        scanner.close();
    }
}
