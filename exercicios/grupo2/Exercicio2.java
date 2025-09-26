/**
 * Pergunte um número. Diga se este numero é primo ou não, escrevendo na tela.
 * @creator Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero e descubra se é primo ou não: ");
        int numero = scanner.nextInt();
        boolean isPrimo = false;
        //IDEALMENTE DEVERIAMOS TESTAR O RESTO DA DIVISAO DO PROPRIO NUMERO ATE O NUMERO 1, UTILIZANDO LOOP
        //POIS O NUMERO 1 SOH EH DIVISIVEL POR 1 E POR ELE MESMO, SOMENTE
        if (numero < 4) {
            isPrimo = true;
        }
        else {
            //maior que 3 ou se for divisivel nem por 2 e nem por 3 e nem por 5 e nem por 7, é primo
            boolean naoEhDivisivelPor2 = (numero % 2 != 0);
            boolean naoEhDivisivelPor3 = (numero % 3 != 0);
            boolean naoEhDivisivelPor5 = (numero % 5 != 0);
            boolean naoEhDivisivelPor7 = (numero % 7 != 0);
            isPrimo = ((naoEhDivisivelPor2 == true) && (naoEhDivisivelPor3 == true) && (naoEhDivisivelPor5 == true) && (naoEhDivisivelPor7 == true));
        }

        if (isPrimo == true) {
            System.out.printf("O número %d é primo", numero);
        }
        else {
            System.out.printf("O número %d não é primo", numero);
        }
        
        //ou
        System.out.println("\nO numero " + numero + ((isPrimo == true) ? " é primo" : " não é primo"));
        scanner.close();
    }
}
