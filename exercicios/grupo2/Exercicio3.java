/**
 * Pergunte um número. Diga se este numero faz parte da tabuada do 3, escrevendo na tela.
 * @creator: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio3 {

    public static boolean isDivisivelPorN(int numeroVerifica, int tabuadaDoN) {
        //CASO O RESTO DA DIVISAO DE UM NUMERO PELO OUTRO SEJA ZERO, ENTAO É DIVISIVEL
        boolean isDivisivel = (numeroVerifica % tabuadaDoN == 0);
        return isDivisivel;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero e descubra se é divisivel por 3: ");
        int numero = scanner.nextInt();
        boolean isDivisivelPor3 = numero != 0 && isDivisivelPorN(numero, 3);

        if(isDivisivelPor3){
            System.out.printf("O numero %d é divisivel por 3", numero);
        }
        else{
            System.out.printf("O numero %d não é divisivel por 3", numero);
        }

        //ou
        System.out.println("\nO numero " + numero + (isDivisivelPor3 ? " é divisivel por 3" : " não é divisível por 3"));
        scanner.close();
    }
}
