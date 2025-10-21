/**
 Ano Bissexto: Um ano é bissexto se for divisível por 400 OU se for divisível por 4 E 
 não for divisível por 100. Peça um ano e verifique se ele é bissexto.
 * @author Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio24 {

    public static boolean isAnoBissexto(int anoCheck) {
        return (anoCheck % 100 != 0 && anoCheck % 4 == 0) || anoCheck % 400 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um ano para descobrir se é ano bissexto: ");
        int ano = scanner.nextInt();
        boolean anoBissexto = isAnoBissexto(ano);
        System.out.println("O ano " + ano + " " + (!anoBissexto ? "não é" : "é") + " bissexto!");
        scanner.close();
    }
}
