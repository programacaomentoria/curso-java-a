/**
 * Faça um programa que some de 0 a 100 somente os números primos, e exiba o resultado. 
 * Número primo é aquele que é divisível somente por ele mesmo e pelo número 1.
 * @author: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo3;

public class Exercicio2 {
    public static void main(String[] args) {
        int soma = 0;
        int quantidadeItensSoma = 100;

        //AVALIA SE A CONDICAO É VERDADEIRA
        //INCREMENTA DE 1 NO CONTADOR
        for (int contador = 0; contador <= quantidadeItensSoma; contador++) {
            //para cada numero, preciso descobrir se o numero é primo
            //se for primo, somo, senao, nao faco nada

            boolean ehPrimo = verificarSeEhPrimo(contador);
            soma = soma + ((ehPrimo) ? contador : 0);
        }
        System.out.println("A somatoria de numeros primos ate " + quantidadeItensSoma + " é: " + soma);
    }

    private static boolean verificarSeEhPrimo(int contador) {
        //DESCOBRE SE O NUMERO EH PRIMO
        boolean ehPrimo = false;
        if (contador == 1) {
            ehPrimo = false;
        }
        else if (contador < 4) {
            ehPrimo = true;
        }
        else {
            ehPrimo = true;
            //criar um outro loop para verificar se o numero é primo ou nao
            for (int controle = contador - 1; controle > 1; controle--) {
                if (contador % controle == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }
        return ehPrimo;
    }
}
