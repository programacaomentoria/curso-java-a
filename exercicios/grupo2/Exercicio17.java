/**
 * Desconto por Compra: Uma loja oferece 10% de desconto se o valor da compra for superior a
R$100,00. Leia o valor da compra e mostre o valor final com ou sem desconto.
 * @author Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio17 {

    public static float PERCENTUAL_DESCONTO = 0.1f;

    public static float calcularValorFinalCompra(float valorDaCompra) {
        float valorFinalDaCompra = (valorDaCompra > 100) ? valorDaCompra - (valorDaCompra * PERCENTUAL_DESCONTO) : valorDaCompra;
        return valorFinalDaCompra;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        float valorCompra = scanner.nextFloat();
        System.out.println("O valor final da compra é: " + calcularValorFinalCompra(valorCompra));
        scanner.close();
    }
}
