/**
 * Faça um programa que exiba de 0 a 100, somente os números ímpares e não divísiveis por 5, e exiba o resultado.
 * @author: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo3;

public class Exercicio3 {
    public static void main(String[] args) {
        int quantidadeItensSoma = 20;

        //AVALIA SE A CONDICAO É VERDADEIRA
        //INCREMENTA DE 1 NO CONTADOR
        for (int contador = 0; contador <= quantidadeItensSoma; contador++) {
            boolean ehImpar = false;
            boolean naoEhDivisivelPorCinco = false;            
            if (contador % 2 != 0) {
                ehImpar = true;
            }
            // ehImpar = (contador % 2 != 0);    //resto da divisao do numero por 2, se diferente de zero, é um numero impar
            
            if (contador % 5 != 0) {
                naoEhDivisivelPorCinco = true;
            }

            if (ehImpar && naoEhDivisivelPorCinco) {
                System.out.println("Este numero " + contador + " é impar e nao divisivel por 5");        
            }
        }
        
    }
}
