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
        //IDEALMENTE DEVERIAMOS TESTAR O RESTO DA DIVISAO DO PROPRIO NUMERO ATE O NUMERO 1,
        //POIS O NUMERO 1 SOH EH DIVISIVEL POR 1 E POR ELE MESMO, SOMENTE
        if (numero < 4) {
            isPrimo = (numero < 4);
        }
        else {
            //maior que 3 ou se for divisivel nem por 2 e nem por 3, é primo
            isPrimo = (numero % 2 != 0) && (numero % 3 != 0);
        }

        if (isPrimo) {
            System.out.printf("O número %d é primo", numero);
        }
        else {
            System.out.printf("O número %d não é primo", numero);
        }
        
        //ou
        System.out.println("\nO numero " + numero + ((isPrimo) ? " é primo" : " não é primo"));
        scanner.close();
    }
}
