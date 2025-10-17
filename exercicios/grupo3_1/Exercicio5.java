/**
 * Tabuada de um Número: Peça ao usuário para digitar um número inteiro e, em seguida, imprima a tabuada desse número (de 1 a 10).
 * @author Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo3_1;

import java.util.Scanner;

public class Exercicio5 {

    public static void criarTabuadaPorNumero(int numeroTabuada) {
        System.out.println("*********************************");
        System.out.printf("*\tTabuada do número %d\t*\n", numeroTabuada);
        System.out.println("*********************************\n");
        for (int contador = 1; contador <= 10; contador++) {
            int sequenciaTabuada = numeroTabuada * contador;
            System.out.printf("%02d x %02d = %02d\n", contador, numeroTabuada, sequenciaTabuada);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para descobrir sua tabuada: ");
        int numeroDaTabuada = scanner.nextInt();

        //CHAMA ROTINA PARA CRIAR TABELA DESCREVENDO SUA TABUADA
        criarTabuadaPorNumero(numeroDaTabuada);

        //para cada sequencia de 1 a 10, multiplicar pelo numero da tabuada
        // for (int contador = 1; contador <= 10; contador++) {
        //     int pontoDaTabuada = contador * numeroDaTabuada;
        //     System.out.println("Ponto da tabuada é: " + pontoDaTabuada);
        // }

        // int num1 = 1 * numeroDaTabuada;
        // System.out.println(num1);
        // int num2 = 2 * numeroDaTabuada;
        // System.out.println(num2);
        // int num3 = 3 * numeroDaTabuada;
        // System.out.println(num3);
        // int num4 = 4 * numeroDaTabuada;
        // System.out.println(num4);
        // int num5 = 5 * numeroDaTabuada;
        // System.out.println(num5);
        // int num6 = 6 * numeroDaTabuada;
        // System.out.println(num6);
        // int num7 = 7 * numeroDaTabuada;
        // System.out.println(num7);
        // int num8 = 8 * numeroDaTabuada;
        // System.out.println(num8);
        // int num9 = 9 * numeroDaTabuada;
        // System.out.println(num9);
        // int num10 = 10 * numeroDaTabuada;
        // System.out.println(num10);

        scanner.close();
    }
}